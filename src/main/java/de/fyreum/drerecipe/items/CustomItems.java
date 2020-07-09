package de.fyreum.drerecipe.items;

import de.fyreum.drerecipe.DRERecipe;
import de.fyreum.drerecipe.recipes.ConfigDataManager;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Material.*;

public class CustomItems {

	private final ConfigDataManager manager = DRERecipe.getInstance().getConfigDataManager();

	public ItemStack getCannon(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getCannonName())
				.setLore(manager.getCannonLore())
				.addToItemList()
				.create();
	}

	public ItemStack getTrebuchet(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getTrebuchetName())
				.setLore(manager.getTrebuchetLore())
				.addToItemList()
				.create();
	}

	public ItemStack getCatapult(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getCatapultName())
				.setLore(manager.getCatapultLore())
				.addToItemList()
				.create();
	}

	public ItemStack getBallista(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getBallistaName())
				.setLore(manager.getBallistaLore())
				.addToItemList()
				.create();
	}

	public ItemStack getRam(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getRamName())
				.setLore(manager.getRamLore())
				.addToItemList()
				.create();
	}

	public ItemStack getCamp(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getCampName())
				.setLore(manager.getCampLore())
				.addToItemList()
				.create();
	}

	public ItemStack getSmallWall(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getSmallWallName())
				.setLore(manager.getSmallWallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getTower(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getTowerName())
				.setLore(manager.getTowerLore())
				.addToItemList()
				.create();
	}

	public ItemStack getLadder(int amount) {
		return new ItemBuilder(CHEST)
				.setAmount(amount)
				.setDisplayName(manager.getLadderName())
				.setLore(manager.getLadderLore())
				.addToItemList()
				.create();
	}

	public ItemStack getCannonBarrel(int amount) {
		return new ItemBuilder(OBSIDIAN)
				.setAmount(amount)
				.setDisplayName(manager.getCannonBarrelName())
				.setLore(manager.getCannonBarrelLore())
				.addToItemList()
				.create();
	}

	public ItemStack getWoodenWheel(int amount) {
		return new ItemBuilder(OAK_PLANKS)
				.setAmount(amount)
				.setDisplayName(manager.getWoodenWheelName())
				.setLore(manager.getWoodenWheelLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStoneWheel(int amount) {
		return new ItemBuilder(COBBLESTONE)
				.setAmount(amount)
				.setDisplayName(manager.getStoneWheelName())
				.setLore(manager.getStoneWheelLore())
				.addToItemList()
				.create();
	}

	public ItemStack getIgniter(int amount) {
		return new ItemBuilder(TORCH)
				.setAmount(amount)
				.setDisplayName(manager.getIgniterName())
				.setLore(manager.getIgniterLore())
				.addToItemList()
				.create();
	}

	public ItemStack getElasticWood(int amount) {
		return new ItemBuilder(STRIPPED_OAK_WOOD)
				.setAmount(amount)
				.setDisplayName(manager.getElasticWoodName())
				.setLore(manager.getElasticWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getTensionWood(int amount) {
		return new ItemBuilder(SPRUCE_SLAB)
				.setAmount(amount)
				.setDisplayName(manager.getTensionWoodName())
				.setLore(manager.getTensionWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStableWood(int amount) {
		return new ItemBuilder(OAK_WOOD)
				.setAmount(amount)
				.setDisplayName(manager.getStableWoodName())
				.setLore(manager.getStableWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getHeavyWood(int amount) {
		return new ItemBuilder(SPRUCE_PLANKS)
				.setAmount(amount)
				.setDisplayName(manager.getHeavyWoodName())
				.setLore(manager.getHeavyWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getShadowWood(int amount) {
		return new ItemBuilder(SPRUCE_WOOD)
				.setAmount(amount)
				.setDisplayName(manager.getShadowWoodName())
				.setLore(manager.getShadowWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getSideWingWood(int amount) {
		return new ItemBuilder(SPRUCE_TRAPDOOR)
				.setAmount(amount)
				.setDisplayName(manager.getSideWingWoodName())
				.setLore(manager.getSideWingWoodLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStableString(int amount) {
		return new ItemBuilder(STRING)
				.setAmount(amount)
				.setDisplayName(manager.getStableStringName())
				.setLore(manager.getStableStringLore())
				.addToItemList()
				.create();
	}

	public ItemStack getShadowWool(int amount) {
		return new ItemBuilder(GRAY_WOOL)
				.setAmount(amount)
				.setDisplayName(manager.getShadowWoolName())
				.setLore(manager.getShadowWoolLore())
				.addToItemList()
				.create();
	}

	public ItemStack getUpgrade(int amount) {
		return new ItemBuilder(GLOWSTONE_DUST)
				.setAmount(amount)
				.setDisplayName(manager.getUpgradeName())
				.setLore(manager.getUpgradeLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStandardCannonBall(int amount) {
		return new ItemBuilder(IRON_BLOCK)
				.setAmount(amount)
				.setDisplayName(manager.getStandardCannonBallName())
				.setLore(manager.getStandardCannonBallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getToxicCannonBall(int amount) {
		return new ItemBuilder(IRON_BLOCK)
				.setAmount(amount)
				.setDisplayName(manager.getToxicCannonBallName())
				.setLore(manager.getToxicCannonBallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getSpreadCannonBall(int amount) {
		return new ItemBuilder(Material.IRON_BLOCK)
				.setAmount(amount)
				.setDisplayName(manager.getSpreadCannonBallName())
				.setLore(manager.getSpreadCannonBallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStandardBolt(int amount) {
		return new ItemBuilder(Material.ARROW)
				.setAmount(amount)
				.setDisplayName(manager.getStandardBallistaBoltName())
				.setLore(manager.getStandardBallistaBoltLore())
				.addToItemList()
				.create();
	}

	public ItemStack getToxicBolt(int amount) {
		return new ItemBuilder(ARROW)
				.setAmount(amount)
				.setDisplayName(manager.getToxicBallistaBoltName())
				.setLore(manager.getToxicBallistaBoltLore())
				.addToItemList()
				.create();
	}

	public ItemStack getSpreadBolt(int amount) {
		return new ItemBuilder(ARROW)
				.setAmount(amount)
				.setDisplayName(manager.getSpreadBallistaBoltName())
				.setLore(manager.getSpreadBallistaBoltLore())
				.addToItemList()
				.create();
	}

	public ItemStack getStandardStoneBall(int amount) {
		return new ItemBuilder(STONE)
				.setAmount(amount)
				.setDisplayName(manager.getStandardCatapultBallName())
				.setLore(manager.getStandardCatapultBallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getToxicStoneBall(int amount) {
		return new ItemBuilder(STONE)
				.setAmount(amount)
				.setDisplayName(manager.getToxicCatapultBallName())
				.setLore(manager.getToxicCatapultBallLore())
				.addToItemList()
				.create();
	}

	public ItemStack getSpreadStoneBall(int amount) {
		return new ItemBuilder(STONE)
				.setAmount(amount)
				.setDisplayName(manager.getSpreadCatapultBallName())
				.setLore(manager.getSpreadCatapultBallLore())
				.addToItemList()
				.create();
	}
}
