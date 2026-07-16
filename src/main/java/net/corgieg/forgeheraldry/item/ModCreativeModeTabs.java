package net.corgieg.forgeheraldry.item;

import net.corgieg.forgeheraldry.ForgeHeraldry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgeHeraldry.MODID);

    public static final Supplier<CreativeModeTab> FORGEHERALDRY_ITEMS_TAB = CREATIVE_MODE_TAB.register("forge_heraldry_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEATED_STEEL_NUGGET.get()))
                    .title(Component.translatable("creativetab.forgeheraldry.forge_heraldry_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HEATED_STEEL_NUGGET);
                        output.accept(ModItems.HEATED_STEEL_ROD);
                        output.accept(ModItems.STEEL_ROD);
                        output.accept(ModItems.SMITHING_JIG);
                        output.accept(ModItems.STEEL_KNIFE_BLADE);
                        output.accept(ModItems.STEEL_STILETTO_BLADE);
                        output.accept(ModItems.STEEL_RAPIER_BLADE);
                        output.accept(ModItems.STEEL_LONGSWORD_BLADE);
                        output.accept(ModItems.STEEL_GREATSWORD_BLADE);
                        output.accept(ModItems.CROSSGUARD);
                        output.accept(ModItems.CROSSGUARD_LARGE);
                        output.accept(ModItems.MACE_HEAD);
                        output.accept(ModItems.HAMMER_HEAD);
                        output.accept(ModItems.WARAXE_HEAD);
                        output.accept(ModItems.POLE);
                    }).build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB.register(eventBus);
}

}
