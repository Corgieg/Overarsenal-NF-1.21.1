package net.corgieg.overarsenal.datagen;

import net.corgieg.overarsenal.OverarsenalMod;
import net.corgieg.overarsenal.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;

import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OverarsenalMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.STEEL_HAMMER);
        handheldItem(ModItems.STEEL_EXCAVATOR);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(OverarsenalMod.MODID,"item/" + item.getId().getPath()));
    }
}
