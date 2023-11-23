package stuff;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ShadowWeaveToolMaterial implements ToolMaterial {

    public static final ShadowWeaveToolMaterial INSTANCE = new ShadowWeaveToolMaterial();

    public static final TutorialItems items = new TutorialItems();

    @Override
    public int getDurability() {
        return 3061;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.NETHERITE;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(items.SHADOWWEAVE_CLOTH);
    }

}
