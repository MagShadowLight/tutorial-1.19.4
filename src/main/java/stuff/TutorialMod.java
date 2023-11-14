package stuff;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.server.ServerTickCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.fabricmc.fabric.impl.client.networking.v0.ClientSidePacketRegistryImpl;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import stuff.network.EnderGauntletPacket;
import stuff.Ender_Gauntlet;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Ender_Gauntlet ENDER_GAUNTLET = new Ender_Gauntlet(new FabricItemSettings().maxCount(1));
	public static final Item RUBY = new Ruby(new FabricItemSettings());
	public static final Item ETHEREAL_CRYSTAL = new Ethereal_Crystal(new FabricItemSettings());
	public static final Item LUMI_INGOT = new Lumi_Ingot(new FabricItemSettings());
	public static final Item AETHERIAL_ESSENCE = new Aetherial_Essence(new FabricItemSettings());
	public static final Item ESSENCE_CRYSTAL = new Essence_Crystal(new FabricItemSettings());
	public static final Item LUMINARA_BLOOM = new Luminara_Bloom(new FabricItemSettings());
	public static final Item RARE_SEED = new Rare_Seed(new FabricItemSettings());
	public static final Item ESSENCE_INFUSED_CRYSTAL = new Essence_Infused_Crystal(new FabricItemSettings());
	public static final Item CELESTIAL_CRYSTAL = new Celestial_Crystal(new FabricItemSettings());
	public static final Item CHRONO_SAND = new Chrono_Sand(new FabricItemSettings());
	public static final Item LUNARITE_INGOT = new Lunarite_ingot(new FabricItemSettings());
	public static final Item AURORA_DUST = new Aurora_Dust(new FabricItemSettings());
	public static final Item ANCIENT_TIMEPIECE = new Ancient_Timepiece(new FabricItemSettings());
	public static final Item CELESTIAL_NECTAR = new Celestial_Nectar(new FabricItemSettings());
	public static final Item STORMFORGED_INGOT = new Stormforged_Ingot(new FabricItemSettings());
	public static final Item UNCHARGED_CRYSTAL = new Uncharged_Crystal_Shard(new FabricItemSettings());
	public static final Item CHARGED_CRYSTAL = new Charged_Crystal_Shard(new FabricItemSettings());
	public static final Item THUNDERSTEEL_INGOT = new ThunderSteel_Ingot(new FabricItemSettings());
	public static final Item SHADOWWEAVE_SILK = new ShadowWeave_Silk(new FabricItemSettings());

	public static final Item ECLIPSIUM_CRYSTAL = new Eclipsium_Crystal(new FabricItemSettings())
	public static final Item SHADOWWEAVE_CLOTH = new ShadowWeave_Cloth(new FabricItemSettings());
	public static final Item PHOENIX_FEATHER = new Phoenix_Feather(new FabricItemSettings());
	public static final Item HARMONIC_CRYSTAL = new Harmonic_Crystal(new FabricItemSettings());
	public static final Item TIME_TWISTED_COMPASS = new Time_Twisted_Compass(new FabricItemSettings());

	public static final String MOD_ID = "tutorial";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Player");
		registerItems();
		ItemGroupModifier();
	}

	private void registerItems() {
		Registry.register(Registries.ITEM, new Identifier(MOD_ID,"ender_gauntlet"), ENDER_GAUNTLET);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ruby"), RUBY);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ethereal_crystal"), ETHEREAL_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lumi_ingot"), LUMI_INGOT);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "aetherial_essence"), AETHERIAL_ESSENCE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "essence_crystal"), ESSENCE_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "luminara_bloom"), LUMINARA_BLOOM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "rare_seed"), RARE_SEED);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "essence_infused_crystal"), ESSENCE_INFUSED_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_crystal"), CELESTIAL_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chrono_sand"), CHRONO_SAND);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "lunarite_ingot"), LUNARITE_INGOT);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "aurora_dust"), AURORA_DUST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "ancient_timepiece"), ANCIENT_TIMEPIECE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "celestial_nector"), CELESTIAL_NECTAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stormforged_ingot"), STORMFORGED_INGOT);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "uncharged_crystal"), UNCHARGED_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "charged_crystal"), CHARGED_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "thundersteel_ingot"), THUNDERSTEEL_INGOT);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_silk"), SHADOWWEAVE_SILK);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "eclipsium_crystal"), ECLIPSIUM_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "shadowweave_cloth"), SHADOWWEAVE_CLOTH);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "phoenix_feather"), PHOENIX_FEATHER);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "harmonic_crystal"), HARMONIC_CRYSTAL);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "time_twisted_compass"), TIME_TWISTED_COMPASS);
	}

	private void ItemGroupModifier() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(Items.MUSIC_DISC_PIGSTEP, ENDER_GAUNTLET);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.DIAMOND, RUBY);
			content.addAfter(RUBY, RARE_SEED);
			content.addAfter(RARE_SEED, LUMINARA_BLOOM);
			content.addAfter(LUMINARA_BLOOM, ESSENCE_CRYSTAL);
			content.addAfter(ESSENCE_CRYSTAL, ESSENCE_INFUSED_CRYSTAL);
			content.addAfter(ESSENCE_INFUSED_CRYSTAL, AETHERIAL_ESSENCE);
			content.addAfter(AETHERIAL_ESSENCE, LUMI_INGOT);
			content.addAfter(LUMI_INGOT, ETHEREAL_CRYSTAL);
			content.addAfter(ETHEREAL_CRYSTAL, CELESTIAL_CRYSTAL);
		});
	}
}