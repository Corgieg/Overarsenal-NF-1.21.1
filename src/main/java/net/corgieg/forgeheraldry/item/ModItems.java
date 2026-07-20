package net.corgieg.forgeheraldry.item;

import net.corgieg.forgeheraldry.ForgeHeraldry;
import net.corgieg.forgeheraldry.item.custom.PommelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForgeHeraldry.MODID);

    public static final DeferredItem<Item> HEATED_STEEL_NUGGET = ITEMS.register("heated_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEATED_STEEL_ROD = ITEMS.register("heated_steel_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ROD = ITEMS.register("steel_rod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMITHING_JIG = ITEMS.register("smithing_jig",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_KNIFE_BLADE = ITEMS.register("steel_knife_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_STILETTO_BLADE = ITEMS.register("steel_stiletto_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_RAPIER_BLADE = ITEMS.register("steel_rapier_blade",
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
    public static final DeferredItem<Item> POLE = ITEMS.register("pole",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_V_SWORD = ITEMS.register("jig_v_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_ARMING_SWORD = ITEMS.register("jig_arming_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_V_LONGSWORD = ITEMS.register("jig_v_longsword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_CLAYMORE = ITEMS.register("jig_claymore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_FLAMBERGE = ITEMS.register("jig_flamberge",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JIG_ZWEIHANDER = ITEMS.register("jig_zweihander",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POMMEL = ITEMS.register("pommel",
            () -> new PommelItem(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
