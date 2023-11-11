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
	public static final Item Item10 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item10"), new Item(new FabricItemSettings()));
	public static final Item Item11 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item11"), new Item(new FabricItemSettings()));
	public static final Item Item12 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item12"), new Item(new FabricItemSettings()));
	public static final Item Item13 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item13"), new Item(new FabricItemSettings()));
	public static final Item Item14 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item14"), new Item(new FabricItemSettings()));
	public static final Item Item15 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item15"), new Item(new FabricItemSettings()));
	public static final Item Item16 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item16"), new Item(new FabricItemSettings()));
	public static final Item Item17 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item17"), new Item(new FabricItemSettings()));
	public static final Item Item18 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item18"), new Item(new FabricItemSettings()));
	public static final Item Item19 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item19"), new Item(new FabricItemSettings()));
	public static final Item Item20 = Registry.register(Registries.ITEM, new Identifier("tutorial", "item20"), new Item(new FabricItemSettings()));

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
		});
	}
}