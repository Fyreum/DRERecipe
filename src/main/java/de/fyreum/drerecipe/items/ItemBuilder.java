package de.fyreum.drerecipe.items;

import de.fyreum.drerecipe.DRERecipe;
import de.fyreum.drerecipe.exceptions.ItemBuilderException;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;

import java.util.List;

public class ItemBuilder {

    private final ItemStack item;
    private ItemMeta meta;
    private PotionMeta potionMeta;
    private boolean isPotionMeta = false;
    private boolean craftable = true;

    public ItemBuilder(Material material) {
        this.item = new ItemStack(material);
        if ( material.equals(Material.POTION) || material.equals(Material.LINGERING_POTION) || material.equals(Material.SPLASH_POTION) ) {
            this.potionMeta = (PotionMeta) item.getItemMeta();
            isPotionMeta = true;
            return;
        }
        this.meta = item.getItemMeta();
    }

    public ItemBuilder setDisplayName(String name) {
        if (isPotionMeta) {
            potionMeta.setDisplayName(name);
            item.setItemMeta(potionMeta);
            return this;
        }
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLocalName(String name) {
        if (isPotionMeta) {
            potionMeta.setLocalizedName(name);
            item.setItemMeta(potionMeta);
            return this;
        }
        meta.setLocalizedName(name);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder addLore(String s) {
        if (isPotionMeta) {
            potionMeta.setDisplayName(s);
            item.setItemMeta(potionMeta);
            return this;
        }
        meta.getLore().add(s);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        if (isPotionMeta) {
            potionMeta.setLore(lore);
            item.setItemMeta(potionMeta);
            return this;
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setCraftable(boolean craftable) {
        this.craftable = craftable;
        return this;
    }

    public ItemBuilder setBasePotionData(PotionData data) {
        if (!isPotionMeta) {
            throw new ItemBuilderException("Couldn't set the basePotionData of item. The Item isn't a Potion.");
        }
        potionMeta.setBasePotionData(data);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        item.getItemMeta().setUnbreakable(unbreakable);
        return this;
    }

    public ItemBuilder addToItemList() {
        DRERecipe plugin = DRERecipe.getInstance();
        if ( plugin.getItemList().contains(item) ) {
            return this;
        }
        plugin.getItemList().add(item);
        return this;
    }

    public ItemStack create() {
        return item;
    }

}
