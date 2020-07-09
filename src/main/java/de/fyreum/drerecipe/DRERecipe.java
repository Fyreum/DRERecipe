package de.fyreum.drerecipe;

import de.fyreum.drerecipe.commands.CommandManager;
import de.fyreum.drerecipe.recipes.ConfigDataManager;
import de.fyreum.drerecipe.recipes.CustomRecipeManager;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class DRERecipe extends JavaPlugin {

    private static DRERecipe plugin;
    private ConfigDataManager cdm;

    @Getter
    private final List<ItemStack> itemList = new ArrayList<>();
    @Getter
    private final HashMap<ItemStack, Boolean> itemCraftable = new HashMap<>();

    public String prefix = ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "DRE" + ChatColor.GRAY + "Recipe" + ChatColor.DARK_GRAY + "] ";

    @Override
    public void onEnable() {
        plugin = this;
        // loads all custom items
        load();
        // register
        getCommand("dr").setExecutor(new CommandManager());
        // loading message
        System.out.println("[DRERecipe] Finished loading");
    }

    @Override
    public void onDisable() {
    }

    public void load() {
        cdm = new ConfigDataManager();
        saveDefaultConfig();
        cdm.load();
    }

    public static DRERecipe getInstance() {
        return plugin;
    }

    public ConfigDataManager getConfigDataManager() {
        return cdm;
    }

}
