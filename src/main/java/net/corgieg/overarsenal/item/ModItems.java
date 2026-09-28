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
    public static final DeferredItem<Item> POMMEL = ITEMS.register("pommel",
            () -> new PommelItem(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> POLE = ITEMS.register("pole",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD = ITEMS.register("crossguard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD_LARGE = ITEMS.register("crossguard_large",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROWHEAD_BODKIN = ITEMS.register("steel_arrowhead_bodkin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROWHEAD_BROAD = ITEMS.register("steel_arrowhead_broad",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROWHEAD_SWALLOWTAIL = ITEMS.register("steel_arrowhead_swallowtail",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BARREL = ITEMS.register("steel_barrel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLADE_SHORT = ITEMS.register("steel_blade_short",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLADE_SINGLE = ITEMS.register("steel_blade_single",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLADE_LONG = ITEMS.register("steel_blade_long",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLADE_STILETTO = ITEMS.register("steel_blade_stiletto",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLADE_RAPIER = ITEMS.register("steel_blade_rapier",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HEAD_HAMMER = ITEMS.register("steel_head_hammer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HEAD_MACE = ITEMS.register("steel_head_mace",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HEAD_PITCHFORK = ITEMS.register("steel_head_pitchfork",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HEAD_WARAXE = ITEMS.register("steel_head_waraxe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_POINT = ITEMS.register("steel_point",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_I = ITEMS.register("smithing_jig_i",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_II = ITEMS.register("smithing_jig_ii",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG_III = ITEMS.register("smithing_jig_iii",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
