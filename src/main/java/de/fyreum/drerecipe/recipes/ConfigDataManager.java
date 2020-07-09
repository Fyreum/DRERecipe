package de.fyreum.drerecipe.recipes;

import de.fyreum.drerecipe.DRERecipe;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.bukkit.ChatColor.*;
@Getter
public class ConfigDataManager {

	private final FileConfiguration config = DRERecipe.getInstance().getConfig();

	private String cannonName;
	private List<String> cannonLore;
	private String trebuchetName;
	private List<String> trebuchetLore;
	private String ballistaName;
	private List<String> ballistaLore;
	private String catapultName;
	private List<String> catapultLore;
	private String ramName;
	private List<String> ramLore;
	private String campName;
	private List<String> campLore;
	private String smallWallName;
	private List<String> smallWallLore;
	private String towerName;
	private List<String> towerLore;
	private String ladderName;
	private List<String> ladderLore;
	private String upgradeName;
	private List<String> upgradeLore;
	private String cannonBarrelName;
	private List<String> cannonBarrelLore;
	private String igniterName;
	private List<String> igniterLore;
	private String woodenWheelName;
	private List<String> woodenWheelLore;
	private String stoneWheelName;
	private List<String> stoneWheelLore;
	private String elasticWoodName;
	private List<String> elasticWoodLore;
	private String tensionWoodName;
	private List<String> tensionWoodLore;
	private String stableWoodName;
	private List<String> stableWoodLore;
	private String heavyWoodName;
	private List<String> heavyWoodLore;
	private String shadowWoodName;
	private List<String> shadowWoodLore;
	private String stableStringName;
	private List<String> stableStringLore;
	private String shadowWoolName;
	private List<String> shadowWoolLore;
	private String sideWingWoodName;
	private List<String> sideWingWoodLore;
	private String standardCannonBallName;
	private List<String> standardCannonBallLore;
	private String toxicCannonBallName;
	private List<String> toxicCannonBallLore;
	private String spreadCannonBallName;
	private List<String> spreadCannonBallLore;
	private String standardCatapultBallName;
	private List<String> standardCatapultBallLore;
	private String toxicCatapultBallName;
	private List<String> toxicCatapultBallLore;
	private String spreadCatapultBallName;
	private List<String> spreadCatapultBallLore;
	private String standardBallistaBoltName;
	private List<String> standardBallistaBoltLore;
	private String toxicBallistaBoltName;
	private List<String> toxicBallistaBoltLore;
	private String spreadBallistaBoltName;
	private List<String> spreadBallistaBoltLore;

	// blueprints / actual weapons

	public void load() {
		// cannon
		cannonName = config.getString("cannon.name");
		cannonLore = config.getStringList("cannon.lore");
		// trebuchet
		trebuchetName = config.getString("trebuchet.name");
		trebuchetLore = config.getStringList("trebuchet.lore");
		// ballista
		ballistaName = config.getString("ballista.name");
		ballistaLore = config.getStringList("ballista.lore");
		// catapult
		catapultName = config.getString("catapult.name");
		catapultLore = config.getStringList("catapult.lore");
		// ram
		ramName = config.getString("ram.name");
		ramLore = config.getStringList("ram.lore");
		// camp
		campName = config.getString("camp.name");
		campLore = config.getStringList("camp.lore");
		// small wall
		smallWallName = config.getString("smallWall.name");
		smallWallLore = config.getStringList("smallWall.lore");
		// tower
		towerName = config.getString("tower.name");
		towerLore = config.getStringList("tower.lore");
		// ladder
		ladderName = config.getString("ladder.name");
		ladderLore = config.getStringList("ladder.lore");

		// crafting material

		// upgrade
		upgradeName = config.getString("upgrade.name");
		upgradeLore = config.getStringList("upgrade.lore");
		// cannon barrel
		cannonBarrelName = config.getString("cannonBarrel.name");
		cannonBarrelLore = config.getStringList("cannonBarrel.lore");
		// igniter
		igniterName = config.getString("igniter.name");
		igniterLore = config.getStringList("igniter.lore");
		// wooden wheel
		woodenWheelName = config.getString("woodenWheel.name");
		woodenWheelLore = config.getStringList("woodenWheel.lore");
		// stone wheel
		stoneWheelName = config.getString("stoneWheel.name");
		stoneWheelLore = config.getStringList("stoneWheel.lore");
		// elastic wood
		elasticWoodName = config.getString("elasticWood.name");
		elasticWoodLore = config.getStringList("elasticWood.lore");
		// side wood
		tensionWoodName = config.getString("tensionWood.name");
		tensionWoodLore = config.getStringList("tensionWood.lore");
		// stable wood
		stableWoodName = config.getString("stableWood.name");
		stableWoodLore = config.getStringList("stableWood.lore");
		// heavy wood
		heavyWoodName = config.getString("heavyWood.name");
		heavyWoodLore = config.getStringList("heavyWood.lore");
		// shadow wood
		shadowWoodName = config.getString("shadowWood.name");
		shadowWoodLore = config.getStringList("shadowWood.lore");
		// stable string
		stableStringName = config.getString("stableString.name");
		stableStringLore = config.getStringList("stableString.lore");
		// shadow wool
		shadowWoolName = config.getString("shadowWool.name");
		shadowWoolLore = config.getStringList("shadowWool.lore");
		// side wing wood
		sideWingWoodName = config.getString("sideWingWood.name");
		sideWingWoodLore = config.getStringList("sideWingWood.lore");

		// munitions

		// cannon ball - standard
		standardCannonBallName = config.getString("standardCannonBall.name");
		standardCannonBallLore = config.getStringList("standardCannonBall.lore");
		// cannon ball - toxic
		toxicCannonBallName = config.getString("toxicCannonBall.name");
		toxicCannonBallLore = config.getStringList("toxicCannonBall.lore");
		// cannon ball - spread
		spreadCannonBallName = config.getString("spreadCannonBall.name");
		spreadCannonBallLore = config.getStringList("spreadCannonBall.lore");

		// trebuchet/catapult ball - standard
		standardCatapultBallName = config.getString("standardCatapultBall.name");
		standardCatapultBallLore = config.getStringList("standardCatapultBall.lore");
		// trebuchet/catapult ball - toxic
		toxicCatapultBallName = config.getString("toxicCatapultBall.name");
		toxicCatapultBallLore = config.getStringList("toxicCatapultBall.lore");
		// trebuchet/catapult ball - spread
		spreadCatapultBallName = config.getString("spreadCatapultBall.name");
		spreadCatapultBallLore = config.getStringList("spreadCatapultBall.lore");

		// ballista bolt - standard
		standardBallistaBoltName = config.getString("standardBallistaBolt.name");
		standardBallistaBoltLore = config.getStringList("standardBallistaBolt.lore");
		// ballista bolt - toxic
		toxicBallistaBoltName = config.getString("toxicBallistaBolt.name");
		toxicBallistaBoltLore = config.getStringList("toxicBallistaBolt.lore");
		// ballista bolt - spread
		spreadBallistaBoltName = config.getString("spreadBallistaBolt.name");
		spreadBallistaBoltLore = config.getStringList("spreadBallistaBolt.lore");

		new CustomRecipeManager().customRecipes();
	}

}
