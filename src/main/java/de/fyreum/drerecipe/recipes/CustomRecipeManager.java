package de.fyreum.drerecipe.recipes;

import de.fyreum.drerecipe.DRERecipe;
import de.fyreum.drerecipe.items.CustomItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import static org.bukkit.Material.*;

public class CustomRecipeManager {

    private final DRERecipe plugin = DRERecipe.getInstance();
    private final CustomItems items = new CustomItems();
    private final Server s = plugin.getServer();

    private final ShapedRecipe cannonRecipe = new ShapedRecipe(new NamespacedKey(plugin, "cannon"), items.getCannon(1));
    private final ShapedRecipe catapultRecipe = new ShapedRecipe(new NamespacedKey(plugin, "catapult"), items.getCatapult(1));
    private final ShapedRecipe trebuchetRecipe = new ShapedRecipe(new NamespacedKey(plugin, "trebuchet"), items.getTrebuchet(1));
    private final ShapedRecipe ballistaRecipe = new ShapedRecipe(new NamespacedKey(plugin, "balliste"), items.getBallista(1));
    private final ShapedRecipe ramRecipe = new ShapedRecipe(new NamespacedKey(plugin, "ram"), items.getRam(1));
    private final ShapedRecipe campRecipe = new ShapedRecipe(new NamespacedKey(plugin, "storm_camp"), items.getCamp(1));
    private final ShapedRecipe smallWallRecipe = new ShapedRecipe(new NamespacedKey(plugin, "small_protection_wall"), items.getSmallWall(1));
    private final ShapedRecipe ladderRecipe = new ShapedRecipe(new NamespacedKey(plugin, "storm_ladder"), items.getLadder(1));
    private final ShapedRecipe towerRecipe = new ShapedRecipe(new NamespacedKey(plugin, "storm_tower"), items.getTower(1));

    private final ShapedRecipe cannonBarrelRecipe = new ShapedRecipe(new NamespacedKey(plugin, "cannon_barrel"), items.getCannonBarrel(1));
    private final ShapedRecipe woodenWheelRecipe = new ShapedRecipe(new NamespacedKey(plugin, "wooden_wheel"), items.getWoodenWheel(1));
    private final ShapedRecipe stoneWheelRecipe = new ShapedRecipe(new NamespacedKey(plugin, "stone_wheel"), items.getStoneWheel(1));
    private final ShapedRecipe igniterRecipe = new ShapedRecipe(new NamespacedKey(plugin, "igniter"), items.getIgniter(1));
    private final ShapedRecipe elasticWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "elastic_wood"), items.getElasticWood(8));
    private final ShapedRecipe stableWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "stable_wood"), items.getStableWood(8));
    private final ShapedRecipe heavyWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "heavy_wood"), items.getHeavyWood(8));
    private final ShapedRecipe shadowWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "shadow_wood"), items.getShadowWood(8));
    private final ShapedRecipe stableStringRecipe = new ShapedRecipe(new NamespacedKey(plugin, "stable_string"), items.getStableString(1));
    private final ShapedRecipe sideWingWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "side_wing_wood"), items.getSideWingWood(1));
    private final ShapedRecipe tensionWoodRecipe = new ShapedRecipe(new NamespacedKey(plugin, "tension_wood"), items.getTensionWood(6));

    private final ShapelessRecipe cannonBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "cannon_ball"), items.getStandardCannonBall(1));
    private final ShapelessRecipe toxicCannonBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "toxic_cannon_ball1"), items.getToxicCannonBall(1));
    private final ShapelessRecipe spreadCannonBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "spread_cannon_ball"), items.getSpreadCannonBall(1));

    private final ShapelessRecipe boltRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "bolt"), items.getStandardBolt(1));
    private final ShapelessRecipe toxicBoltRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "toxic_bolt1"), items.getToxicBolt(1));
    private final ShapelessRecipe spreadBoltRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "spread_bolt"), items.getSpreadBolt(1));

    private final ShapelessRecipe stoneBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "stone_ball"), items.getStandardStoneBall(1));
    private final ShapelessRecipe toxicStoneBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "toxic_stone_ball1"), items.getToxicStoneBall(1));
    private final ShapelessRecipe spreadStoneBallRecipe = new ShapelessRecipe(new NamespacedKey(plugin, "spread_stone_ball"), items.getSpreadStoneBall(1));

    public void customRecipes() {
        System.out.println("[DRERecipe] Loading recipes");

        // cannon
        cannonRecipe.shape("t  ", "bbb", "ss ");
        cannonRecipe.setIngredient('t', new RecipeChoice.ExactChoice(items.getIgniter(1)));
        cannonRecipe.setIngredient('b', new RecipeChoice.ExactChoice(items.getCannonBarrel(1)));
        cannonRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getStoneWheel(1)));
        s.addRecipe(cannonRecipe);

        // trebuchet
        trebuchetRecipe.shape("w  ", "sw ", "xcw");
        trebuchetRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getHeavyWood(1)));
        trebuchetRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getStableString(1)));
        trebuchetRecipe.setIngredient('x', new RecipeChoice.ExactChoice(items.getShadowWood(1)));
        trebuchetRecipe.setIngredient('c', new RecipeChoice.ExactChoice(items.getCatapult(1)));
        s.addRecipe(trebuchetRecipe);

        // catapult
        catapultRecipe.shape("t  ", "st ", "rrt");
        catapultRecipe.setIngredient('t', new RecipeChoice.ExactChoice(items.getTensionWood(1)));
        catapultRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getStableString(1)));
        catapultRecipe.setIngredient('r', new RecipeChoice.ExactChoice(items.getWoodenWheel(1)));
        s.addRecipe(catapultRecipe);

        // ballista recipe
        ballistaRecipe.shape("  t","wwi","sst");
        ballistaRecipe.setIngredient('t', new RecipeChoice.ExactChoice(items.getSideWingWood(1)));
        ballistaRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getTensionWood(1)));
        ballistaRecipe.setIngredient('i', Material.IRON_BLOCK);
        ballistaRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getShadowWood(1)));
        s.addRecipe(ballistaRecipe);

        // ram recipe
        ramRecipe.shape("   ", "wws", "rrr");
        ramRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getStableWood(1)));
        ramRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getShadowWood(1)));
        ramRecipe.setIngredient('r', new RecipeChoice.ExactChoice(items.getWoodenWheel(1)));
        s.addRecipe(ramRecipe);

        // camp recipe
        campRecipe.shape(" w ", "wsw", "fae");
        campRecipe.setIngredient('w', Material.RED_WOOL);
        campRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getShadowWood(1)));
        campRecipe.setIngredient('f', Material.FURNACE);
        campRecipe.setIngredient('a', Material.ANVIL);
        campRecipe.setIngredient('e', Material.ENCHANTING_TABLE);
        s.addRecipe(campRecipe);

        // small wall recipe
        smallWallRecipe.shape("hhh", "hhh");
        smallWallRecipe.setIngredient('h', new RecipeChoice.ExactChoice(items.getHeavyWood(1)));
        s.addRecipe(smallWallRecipe);

        // ladder recipe
        ladderRecipe.shape("hlh", "hlh", "wlw");
        ladderRecipe.setIngredient('h', new RecipeChoice.ExactChoice(items.getHeavyWood(1)));
        ladderRecipe.setIngredient('l', Material.LADDER);
        ladderRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getWoodenWheel(1)));
        s.addRecipe(ladderRecipe);

        // tower recipe
        towerRecipe.shape("sls", "sys", "wxw");
        towerRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getShadowWood(1)));
        towerRecipe.setIngredient('l', Material.LADDER);
        towerRecipe.setIngredient('y', new RecipeChoice.ExactChoice(items.getLadder(1)));
        towerRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getWoodenWheel(1)));
        towerRecipe.setIngredient('x', new RecipeChoice.ExactChoice(items.getSmallWall(1)));
        s.addRecipe(towerRecipe);

        // crafting material

        // cannon barrel recipe
        cannonBarrelRecipe.shape("ooo", "iii", "ooo");
        cannonBarrelRecipe.setIngredient('o', Material.OBSIDIAN);
        cannonBarrelRecipe.setIngredient('i', Material.IRON_BLOCK);
        s.addRecipe(cannonBarrelRecipe);

        // wooden wheel recipe
        woodenWheelRecipe.shape(" w ", "wiw", " w ");
        woodenWheelRecipe.setIngredient('w', Material.OAK_PLANKS);
        woodenWheelRecipe.setIngredient('i', Material.IRON_INGOT);
        s.addRecipe(woodenWheelRecipe);

        // stone wheel recipe
        stoneWheelRecipe.shape(" c ", "cwc", " c ");
        stoneWheelRecipe.setIngredient('c', Material.COBBLESTONE);
        stoneWheelRecipe.setIngredient('w', new RecipeChoice.ExactChoice(items.getWoodenWheel(1)));
        s.addRecipe(stoneWheelRecipe);

        // igniter recipe
        igniterRecipe.shape(" g", " s");
        igniterRecipe.setIngredient('g', Material.GUNPOWDER);
        igniterRecipe.setIngredient('s', Material.STICK);
        s.addRecipe(igniterRecipe);

        // elastic wood recipe
        elasticWoodRecipe.shape("www", "wgw", "www");
        elasticWoodRecipe.setIngredient('w', Material.OAK_PLANKS);
        elasticWoodRecipe.setIngredient('g', Material.GOLD_INGOT);
        s.addRecipe(elasticWoodRecipe);

        // stable wood recipe
        stableWoodRecipe.shape("www", "wiw", "www");
        stableWoodRecipe.setIngredient('w', Material.OAK_PLANKS);
        stableWoodRecipe.setIngredient('i', Material.IRON_INGOT);
        s.addRecipe(stableWoodRecipe);

        // heavy wood recipe
        heavyWoodRecipe.shape("sss", "sus", "sss");
        heavyWoodRecipe.setIngredient('s', new RecipeChoice.ExactChoice(items.getStableWood(1)));
        heavyWoodRecipe.setIngredient('u', new RecipeChoice.ExactChoice(items.getUpgrade(1)));
        s.addRecipe(heavyWoodRecipe);

        // shadow wood recipe
        shadowWoodRecipe.shape("hhh", "huh", "hhh");
        shadowWoodRecipe.setIngredient('h', new RecipeChoice.ExactChoice(items.getHeavyWood(1)));
        shadowWoodRecipe.setIngredient('u', new RecipeChoice.ExactChoice(items.getUpgrade(1)));
        s.addRecipe(shadowWoodRecipe);

        // stable string recipe
        stableStringRecipe.shape(" s ", "sis", " s ");
        stableStringRecipe.setIngredient('s', Material.STRING);
        stableStringRecipe.setIngredient('i', Material.IRON_INGOT);
        s.addRecipe(stableStringRecipe);

        // side wing wood
        sideWingWoodRecipe.shape("tt");
        sideWingWoodRecipe.setIngredient('t', new RecipeChoice.ExactChoice(items.getTensionWood(1)));
        s.addRecipe(sideWingWoodRecipe);

        // tension wood recipe
        tensionWoodRecipe.shape(" u ", "eee");
        tensionWoodRecipe.setIngredient('u', new RecipeChoice.ExactChoice(items.getUpgrade(1)));
        tensionWoodRecipe.setIngredient('e', new RecipeChoice.ExactChoice(items.getElasticWood(1)));
        s.addRecipe(tensionWoodRecipe);

        // cannon ball
        cannonBallRecipe.addIngredient(IRON_BLOCK);
        cannonBallRecipe.addIngredient(COBBLESTONE);
        s.addRecipe(cannonBallRecipe);

        // toxic cannon ball
        toxicCannonBallRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardCannonBall(1)));
        toxicCannonBallRecipe.addIngredient(FERMENTED_SPIDER_EYE);
        s.addRecipe(toxicCannonBallRecipe);

        // spread cannon ball
        spreadCannonBallRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardCannonBall(3)));
        s.addRecipe(spreadCannonBallRecipe);

        // stone ball
        stoneBallRecipe.addIngredient(IRON_INGOT);
        stoneBallRecipe.addIngredient(8, COBBLESTONE);
        s.addRecipe(stoneBallRecipe);

        // toxic stone ball
        toxicStoneBallRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardStoneBall(1)));
        toxicStoneBallRecipe.addIngredient(FERMENTED_SPIDER_EYE);
        s.addRecipe(toxicStoneBallRecipe);

        // spread stone ball
        spreadStoneBallRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardStoneBall(3)));
        s.addRecipe(spreadStoneBallRecipe);

        // bolt
        boltRecipe.addIngredient(4, IRON_INGOT);
        boltRecipe.addIngredient(ARROW);
        s.addRecipe(boltRecipe);

        // toxic bolt
        toxicBoltRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardBolt(1)));
        toxicBoltRecipe.addIngredient(FERMENTED_SPIDER_EYE);
        s.addRecipe(toxicBoltRecipe);

        // spread bolt
        spreadBoltRecipe.addIngredient(new RecipeChoice.ExactChoice(items.getStandardBolt(3)));
        s.addRecipe(spreadBoltRecipe);
    }

}
