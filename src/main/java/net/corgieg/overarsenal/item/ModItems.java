package net.corgieg.overarsenal.item;

import net.corgieg.overarsenal.OverarsenalMod;
import net.corgieg.overarsenal.item.custom.PommelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OverarsenalMod.MODID);

    public static final DeferredItem<Item> HEATED_STEEL_NUGGET = ITEMS.register("heated_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEATED_STEEL_PLATE = ITEMS.register("heated_steel_plate",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEATED_STEEL_ROD = ITEMS.register("heated_steel_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ROD = ITEMS.register("steel_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_I = ITEMS.register("smithing_jig_i",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_II = ITEMS.register("smithing_jig_ii",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_III = ITEMS.register("smithing_jig_iii",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_KNIFE_BLADE = ITEMS.register("steel_knife_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_STILETTO_BLADE = ITEMS.register("steel_stiletto_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_RAPIER_BLADE = ITEMS.register("steel_rapier_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SWORD_BLADE_SINGLE = ITEMS.register("steel_sword_blade_single",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_LONGSWORD_BLADE = ITEMS.register("steel_longsword_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_GREATSWORD_BLADE = ITEMS.register("steel_greatsword_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD = ITEMS.register("crossguard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD_SMALL = ITEMS.register("crossguard_small",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD_LARGE = ITEMS.register("crossguard_large",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_MACE_HEAD = ITEMS.register("steel_mace_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HAMMER_HEAD = ITEMS.register("steel_hammer_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_WARAXE_HEAD = ITEMS.register("steel_waraxe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SPEARHEAD = ITEMS.register("steel_spearhead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_PITCHFORK_HEAD = ITEMS.register("steel_pitchfork_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_WARDART_HEAD = ITEMS.register("steel_wardart_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLE = ITEMS.register("pole",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROW_HEAD_BODKIN = ITEMS.register("steel_arrow_head_bodkin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROW_HEAD_BROAD = ITEMS.register("steel_arrow_head_broad",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROW_HEAD_SWALLOWTAIL = ITEMS.register("steel_arrow_head_swallowtail",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BARREL = ITEMS.register("steel_barrel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POMMEL = ITEMS.register("pommel",
            () -> new PommelItem(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
