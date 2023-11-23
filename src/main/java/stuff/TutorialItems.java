package stuff;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class TutorialItems {
    public static final Enchantment SLOWFALL = new SlowFallEnchantment();
    public static final Enchantment AIRASPECT = new AirAspectEnchantment();
    public static final Enchantment WIND = new WindEnchantment();
    public static final Ender_Gauntlet ENDER_GAUNTLET = new Ender_Gauntlet(new FabricItemSettings().maxCount(1));
    public static final ArmorMaterial RUBY_ARMOR_MATERIALS = new RubyArmorMaterials();
    public static final Item RUBY = new Ruby(new FabricItemSettings());
    public static final Item RUBY_HELMET = new ArmorItem(RUBY_ARMOR_MATERIALS, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item RUBY_CHESTPLATE = new ArmorItem(RUBY_ARMOR_MATERIALS, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item RUBY_LEGGINGS = new ArmorItem(RUBY_ARMOR_MATERIALS, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item RUBY_BOOTS = new ArmorItem(RUBY_ARMOR_MATERIALS, ArmorItem.Type.BOOTS, new Item.Settings());
    public static final ToolItem RUBY_PICKAXE = new PickaxeItem(RubyToolMaterials.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static final ToolItem RUBY_AXE = new AxeItem(RubyToolMaterials.INSTANCE, 6.0F, -3.0F, new FabricItemSettings());
    public static final ToolItem RUBY_SHOVEL = new ShovelItem(RubyToolMaterials.INSTANCE, 2, -3.0F, new FabricItemSettings());
    public static final ToolItem RUBY_SWORD = new SwordItem(RubyToolMaterials.INSTANCE, 4, -2.4F, new FabricItemSettings());
    public static final ToolItem RUBY_HOE = new HoeItem(RubyToolMaterials.INSTANCE, -6, 0.0F, new FabricItemSettings());
    public static final Item ETHEREAL_CRYSTAL = new Ethereal_Crystal(new FabricItemSettings());
    public static final Item LUMI_INGOT = new Lumi_Ingot(new FabricItemSettings());
    public static final Item AETHERIAL_ESSENCE = new Aetherial_Essence(new FabricItemSettings());
    public static final Item ESSENCE_CRYSTAL = new Essence_Crystal(new FabricItemSettings());
    public static final Item LUMINARA_BLOOM = new Luminara_Bloom(new FabricItemSettings());
    public static final Item RARE_SEED = new Rare_Seed(new FabricItemSettings());
    public static final Item ESSENCE_INFUSED_CRYSTAL = new Essence_Infused_Crystal(new FabricItemSettings());
    public static final ArmorMaterial  CELESTIAL_ARMOR_MATERIALS = new CelestialCrystalArmorMaterial();
    public static final Item CELESTIAL_CRYSTAL = new Celestial_Crystal(new Item.Settings());
    public static final Item CELESTIAL_HELMET = new ArmorItem(CELESTIAL_ARMOR_MATERIALS, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item CELESTIAL_CHESTPLATE = new ArmorItem(CELESTIAL_ARMOR_MATERIALS, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item CELESTIAL_LEGGING = new ArmorItem(CELESTIAL_ARMOR_MATERIALS, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item CELESTIAL_BOOTS = new ArmorItem(CELESTIAL_ARMOR_MATERIALS, ArmorItem.Type.BOOTS, new Item.Settings());
    public static ToolItem CELESTIAL_PICKAXE = new PickaxeItem(CelestialCrystalToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static ToolItem CELESTIAL_AXE = new AxeItem(CelestialCrystalToolMaterial.INSTANCE, 6.0F, -3.0F, new FabricItemSettings());
    public static ToolItem CELESTIAL_SHOVEL = new ShovelItem(CelestialCrystalToolMaterial.INSTANCE, 2, -3.0F, new FabricItemSettings());
    public static ToolItem CELESTIAL_SWORD = new SwordItem(CelestialCrystalToolMaterial.INSTANCE, 4, -2.4F, new FabricItemSettings());
    public static ToolItem CELESTIAL_HOE = new HoeItem(CelestialCrystalToolMaterial.INSTANCE, -4, 0.0F, new FabricItemSettings());

    public static final Item CHRONO_SAND = new Chrono_Sand(new FabricItemSettings());
    public static final Item LUNARITE_INGOT = new Lunarite_ingot(new FabricItemSettings());
    public static final Item AURORA_DUST = new Aurora_Dust(new FabricItemSettings());
    public static final Item ANCIENT_TIMEPIECE = new Ancient_Timepiece(new FabricItemSettings());
    public static final Item CELESTIAL_NECTAR = new Celestial_Nectar(new FabricItemSettings());
    public static final ArmorMaterial STORMFORGED_ARMOR_MATERIALS = new StormForgedIngotArmorMaterial();
    public static final Item STORMFORGED_INGOT = new Stormforged_Ingot(new FabricItemSettings());
    public static final Item STORMFORGED_HELMET = new ArmorItem(STORMFORGED_ARMOR_MATERIALS, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item STORMFORGED_CHESTPLATE = new ArmorItem(STORMFORGED_ARMOR_MATERIALS, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item STORMFORGED_LEGGING = new ArmorItem(STORMFORGED_ARMOR_MATERIALS, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item STORMFORGED_BOOT = new ArmorItem(STORMFORGED_ARMOR_MATERIALS, ArmorItem.Type.BOOTS, new Item.Settings());
    public static ToolItem STORMFORGED_PICKAXE = new PickaxeItem(StormForgedToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static ToolItem STORMFORGED_AXE = new AxeItem(StormForgedToolMaterial.INSTANCE, 6.0F, -3.0F, new FabricItemSettings());
    public static ToolItem STORMFORGED_SHOVEL = new ShovelItem(StormForgedToolMaterial.INSTANCE, 2, -3.0F, new FabricItemSettings());
    public static ToolItem STORMFORGED_SWORD = new SwordItem(StormForgedToolMaterial.INSTANCE, 4, -2.4F, new FabricItemSettings());
    public static ToolItem STORMFORGED_HOE = new HoeItem(StormForgedToolMaterial.INSTANCE, -5, 0.0F, new FabricItemSettings());

    public static final Item UNCHARGED_CRYSTAL = new Uncharged_Crystal_Shard(new FabricItemSettings());
    public static final Item CHARGED_CRYSTAL = new Charged_Crystal_Shard(new FabricItemSettings());
    public static final Item THUNDERSTEEL_INGOT = new ThunderSteel_Ingot(new FabricItemSettings());
    public static final Item SHADOWWEAVE_SILK = new ShadowWeave_Silk(new FabricItemSettings());

    public static final Item ECLIPSIUM_CRYSTAL = new Eclipsium_Crystal(new FabricItemSettings());
    public static final ArmorMaterial SHADOWWEAVE_ARMOR_MATERIAL = new ShadowWeaveArmorMaterial();
    public static final Item SHADOWWEAVE_CLOTH = new ShadowWeave_Cloth(new FabricItemSettings());
    public static final Item SHADOWWEAVE_HAT = new ArmorItem(SHADOWWEAVE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item SHADOWWEAVE_ROBE = new ArmorItem(SHADOWWEAVE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item SHADOWWEAVE_LEGGINGS = new ArmorItem(SHADOWWEAVE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item SHADOWWEAVE_SHOES = new ArmorItem(SHADOWWEAVE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());
    public static ToolItem SHADOWWEAVE_PICKAXE = new PickaxeItem(ShadowWeaveToolMaterial.INSTANCE, 1, -2.8F, new FabricItemSettings());
    public static ToolItem SHADOWWEAVE_AXE = new AxeItem(ShadowWeaveToolMaterial.INSTANCE, 6.0F, -3.0F, new FabricItemSettings());
    public static ToolItem SHADOWWEAVE_SHOVEL = new ShovelItem(ShadowWeaveToolMaterial.INSTANCE, 2, -3.0F, new FabricItemSettings());
    public static ToolItem SHADOWWEAVE_SWORD = new SwordItem(ShadowWeaveToolMaterial.INSTANCE, 4, -2.4F, new FabricItemSettings());
    public static ToolItem SHADOWWEAVE_HOE = new HoeItem(ShadowWeaveToolMaterial.INSTANCE, -5, 0.0F, new FabricItemSettings());
    public static final Item PHOENIX_FEATHER = new Phoenix_Feather(new FabricItemSettings());
    public static final Item HARMONIC_CRYSTAL = new Harmonic_Crystal(new FabricItemSettings());
    public static final Item TIME_TWISTED_COMPASS = new Time_Twisted_Compass(new FabricItemSettings());
    public static final Item CHRONO_GEAR = new Chrono_Gear(new FabricItemSettings());
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("tutorial", "tutorial_group"))
            .icon(() -> new ItemStack(RUBY))
            .build();
    public static final ItemGroup TOOLS_AND_ARMOR_GROUP = FabricItemGroup.builder(new Identifier("tutorial", "tutorial_tools_and_armors"))
            .icon(() -> new ItemStack(CELESTIAL_CRYSTAL))
            .build();


    public static final String MOD_ID = "tutorial";

    public static final TutorialMod tutorial = new TutorialMod();

    public static void RegisterItems() {
        tutorial.LOGGER.info("Registering Items");
        Registry.register(Registries.ITEM, new Identifier(MOD_ID,"ender_gauntlet"), ENDER_GAUNTLET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_boots"), RUBY_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_shovel"), RUBY_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_sword"), RUBY_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby_hoe"), RUBY_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ethereal_crystal"), ETHEREAL_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lumi_ingot"), LUMI_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "aetherial_essence"), AETHERIAL_ESSENCE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "essence_crystal"), ESSENCE_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "luminara_bloom"), LUMINARA_BLOOM);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rare_seed"), RARE_SEED);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "essence_infused_crystal"), ESSENCE_INFUSED_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_crystal"), CELESTIAL_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_helmet"), CELESTIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_chestplate"), CELESTIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_legging"), CELESTIAL_LEGGING);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_boot"), CELESTIAL_BOOTS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_pickaxe"), CELESTIAL_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_axe"), CELESTIAL_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_shovel"), CELESTIAL_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_sword"), CELESTIAL_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_hoe"), CELESTIAL_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chrono_sand"), CHRONO_SAND);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunarite_ingot"), LUNARITE_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "aurora_dust"), AURORA_DUST);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ancient_timepiece"), ANCIENT_TIMEPIECE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_nector"), CELESTIAL_NECTAR);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_ingot"), STORMFORGED_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_helmet"), STORMFORGED_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_chestplate"), STORMFORGED_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_leggings"), STORMFORGED_LEGGING);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_boots"), STORMFORGED_BOOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_pickaxe"), STORMFORGED_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_axe"), STORMFORGED_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_shovel"), STORMFORGED_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_sword"), STORMFORGED_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_hoe"), STORMFORGED_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "uncharged_crystal"), UNCHARGED_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "charged_crystal"), CHARGED_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "thundersteel_ingot"), THUNDERSTEEL_INGOT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_silk"), SHADOWWEAVE_SILK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eclipsium_crystal"), ECLIPSIUM_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_cloth"), SHADOWWEAVE_CLOTH);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_hat"), SHADOWWEAVE_HAT);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_robe"), SHADOWWEAVE_ROBE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_leggings"), SHADOWWEAVE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_shoes"), SHADOWWEAVE_SHOES);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_pickaxe"), SHADOWWEAVE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_axe"), SHADOWWEAVE_AXE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_shovel"), SHADOWWEAVE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_sword"), SHADOWWEAVE_SWORD);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_hoe"), SHADOWWEAVE_HOE);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "phoenix_feather"), PHOENIX_FEATHER);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "harmonic_crystal"), HARMONIC_CRYSTAL);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "time_twisted_compass"), TIME_TWISTED_COMPASS);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chrono_gear"), CHRONO_GEAR);
        Registry.register(Registries.ENCHANTMENT, new Identifier("tutorial", "slowfall"), SLOWFALL);
        Registry.register(Registries.ENCHANTMENT, new Identifier("tutorial", "air_aspect"), AIRASPECT);
        Registry.register(Registries.ENCHANTMENT, new Identifier("tutorial", "wind"), WIND);
        tutorial.LOGGER.info("Items Registered");
    }

    public static void ItemGroupModifier() {
        tutorial.LOGGER.info("Adding tutorial group with new items");
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(ENDER_GAUNTLET);
            content.add(RUBY);
            content.add(ETHEREAL_CRYSTAL);
            content.add(LUMI_INGOT);
            content.add(AETHERIAL_ESSENCE);
            content.add(ESSENCE_CRYSTAL);
            content.add(LUMINARA_BLOOM);
            content.add(RARE_SEED);
            content.add(ESSENCE_INFUSED_CRYSTAL);
            content.add(CELESTIAL_CRYSTAL);
            content.add(CHRONO_SAND);
            content.add(LUNARITE_INGOT);
            content.add(AURORA_DUST);
            content.add(ANCIENT_TIMEPIECE);
            content.add(CELESTIAL_NECTAR);
            content.add(STORMFORGED_INGOT);
            content.add(UNCHARGED_CRYSTAL);
            content.add(CHARGED_CRYSTAL);
            content.add(THUNDERSTEEL_INGOT);
            content.add(SHADOWWEAVE_SILK);
            content.add(ECLIPSIUM_CRYSTAL);
            content.add(SHADOWWEAVE_CLOTH);
            content.add(PHOENIX_FEATHER);
            content.add(HARMONIC_CRYSTAL);
            content.add(TIME_TWISTED_COMPASS);
            content.add(CHRONO_GEAR);
        });
        tutorial.LOGGER.info("tutorial group added");
        tutorial.LOGGER.info("Adding tutorial tools and armors group");
        ItemGroupEvents.modifyEntriesEvent(TOOLS_AND_ARMOR_GROUP).register(content -> {
            content.add(RUBY_HELMET);
            content.add(RUBY_CHESTPLATE);
            content.add(RUBY_LEGGINGS);
            content.add(RUBY_BOOTS);
            content.add(RUBY_PICKAXE);
            content.add(RUBY_AXE);
            content.add(RUBY_SHOVEL);
            content.add(RUBY_SWORD);
            content.add(RUBY_HOE);
            content.add(CELESTIAL_HELMET);
            content.add(CELESTIAL_CHESTPLATE);
            content.add(CELESTIAL_LEGGING);
            content.add(CELESTIAL_BOOTS);
            content.add(CELESTIAL_PICKAXE);
            content.add(CELESTIAL_AXE);
            content.add(CELESTIAL_SHOVEL);
            content.add(CELESTIAL_SWORD);
            content.add(CELESTIAL_HOE);
            content.add(STORMFORGED_HELMET);
            content.add(STORMFORGED_CHESTPLATE);
            content.add(STORMFORGED_LEGGING);
            content.add(STORMFORGED_BOOT);
            content.add(STORMFORGED_PICKAXE);
            content.add(STORMFORGED_AXE);
            content.add(STORMFORGED_SHOVEL);
            content.add(STORMFORGED_SWORD);
            content.add(STORMFORGED_HOE);
            content.add(SHADOWWEAVE_HAT);
            content.add(SHADOWWEAVE_ROBE);
            content.add(SHADOWWEAVE_LEGGINGS);
            content.add(SHADOWWEAVE_SHOES);
            content.add(SHADOWWEAVE_PICKAXE);
            content.add(SHADOWWEAVE_AXE);
            content.add(SHADOWWEAVE_SHOVEL);
            content.add(SHADOWWEAVE_SWORD);
            content.add(SHADOWWEAVE_HOE);
        });
        tutorial.LOGGER.info("tutorial tools and armors group added");
    }



}
