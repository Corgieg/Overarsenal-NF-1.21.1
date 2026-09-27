package net.corgieg.overarsenal.item;

import net.corgieg.overarsenal.OverarsenalMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OverarsenalMod.MODID);

    public static final Supplier<CreativeModeTab> OVERARSENAL_ITEMS_TAB = CREATIVE_MODE_TAB.register("overarsenal_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SMITHING_JIG_III.get()))
                    .title(Component.translatable("creativetab.overarsenal.overarsenal_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Crafting Components
                        output.accept(ModItems.HEATED_STEEL_NUGGET);
                        output.accept(ModItems.HEATED_STEEL_PLATE);
                        output.accept(ModItems.HEATED_STEEL_ROD);
                        output.accept(ModItems.STEEL_ROD);
                        output.accept(ModItems.POMMEL);
                        output.accept(ModItems.POLE);
                        output.accept(ModItems.CROSSGUARD);
                        output.accept(ModItems.CROSSGUARD_LARGE);
                        output.accept(ModItems.STEEL_ARROW_HEAD_BODKIN);
                        output.accept(ModItems.STEEL_ARROW_HEAD_BROAD);
                        output.accept(ModItems.STEEL_ARROW_HEAD_SWALLOWTAIL);
                        output.accept(ModItems.STEEL_BARREL);
                        // Tool Heads
                        output.accept(ModItems.STEEL_SHORT_BLADE);
                        output.accept(ModItems.STEEL_STILETTO_BLADE);
                        output.accept(ModItems.STEEL_RAPIER_BLADE);
                        output.accept(ModItems.STEEL_SWORD_BLADE_SINGLE);
                        output.accept(ModItems.STEEL_LONGSWORD_BLADE);
                        output.accept(ModItems.STEEL_GREATSWORD_BLADE);
                        output.accept(ModItems.STEEL_MACE_HEAD);
                        output.accept(ModItems.STEEL_HAMMER_HEAD);
                        output.accept(ModItems.STEEL_WARAXE_HEAD);
                        output.accept(ModItems.STEEL_POINT);
                        output.accept(ModItems.STEEL_PITCHFORK_HEAD);
                        // Jigs
                        output.accept(ModItems.SMITHING_JIG_I);
                        output.accept(ModItems.SMITHING_JIG_II);
                        output.accept(ModItems.SMITHING_JIG_III);

                    }).build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB.register(eventBus);
}

}
