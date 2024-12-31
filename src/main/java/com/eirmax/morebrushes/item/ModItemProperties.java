package com.eirmax.morebrushes.item;



import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

public class ModItemProperties {
    public static void addCustomItemProperties() {

        ItemProperties.register(ModItems.DIAMOND_BRUSH.get(), ResourceLocation.withDefaultNamespace("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float)(p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;
        });
        ItemProperties.register(ModItems.NETHERITE_BRUSH.get(), ResourceLocation.withDefaultNamespace("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float)(p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;
        });
        ItemProperties.register(ModItems.IRON_BRUSH.get(), ResourceLocation.withDefaultNamespace("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float)(p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;
        });
        ItemProperties.register(ModItems.GOLD_BRUSH.get(), ResourceLocation.withDefaultNamespace("brushing"), (p_272332_, p_272333_, p_272334_, p_272335_) -> {
            return p_272334_ != null && p_272334_.getUseItem() == p_272332_ ? (float)(p_272334_.getUseItemRemainingTicks() % 10) / 10.0F : 0.0F;
        });


    }
}

