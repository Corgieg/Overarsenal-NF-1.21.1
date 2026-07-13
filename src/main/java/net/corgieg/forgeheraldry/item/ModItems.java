package net.corgieg.forgeheraldry.item;

import net.corgieg.forgeheraldry.ForgeHeraldry;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ForgeHeraldry.MODID);

    public static final DeferredItem<Item> STEEL_KNIFE_BLADE = ITEMS.register("steel_knife_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DAGGER_GUARD = ITEMS.register("dagger_guard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
