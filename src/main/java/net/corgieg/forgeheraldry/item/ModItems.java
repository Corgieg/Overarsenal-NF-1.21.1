package net.corgieg.forgeheraldry.item;

import net.corgieg.forgeheraldry.ForgeHeraldry;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForgeHeraldry.MODID);

    public static final DeferredItem<Item> HEATED_STEEL_NUGGET = ITEMS.register("heated_steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_KNIFE_BLADE = ITEMS.register("steel_knife_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD = ITEMS.register("crossguard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSGUARD_LARGE = ITEMS.register("crossguard_large",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MACE_HEAD = ITEMS.register("mace_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HAMMER_HEAD = ITEMS.register("hammer_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARAXE_HEAD = ITEMS.register("waraxe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLE = ITEMS.register("pole",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
