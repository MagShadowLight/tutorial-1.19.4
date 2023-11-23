package stuff;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import stuff.TutorialItems;

public class CelestialCrystalToolMaterial implements ToolMaterial {

    public static final CelestialCrystalToolMaterial INSTANCE = new CelestialCrystalToolMaterial();

    public static final TutorialItems items = new TutorialItems();

    @Override
    public int getDurability() {
        return 2561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 4.0F;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.NETHERITE;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(items.CELESTIAL_CRYSTAL);
    }
}
