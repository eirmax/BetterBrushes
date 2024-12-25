package com.eirmax.morebrushes.creativetabs;


import com.eirmax.morebrushes.BetterBrushes;
import com.eirmax.morebrushes.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBrushes.MODID);

    public static final RegistryObject<CreativeModeTab> BETTER_BRUSHES = CREATIVE_MODE_TABS.register("better_brushes",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_BRUSH.get()))
                    .title(Component.translatable("creativetab.betterbrushes"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.IRON_BRUSH.get());
                        output.accept(ModItems.GOLD_BRUSH.get());
                        output.accept(ModItems.DIAMOND_BRUSH.get());
                        output.accept(ModItems.NETHERITE_BRUSH.get());
                        output.accept(ModItems.IMPROVED_FEATHER.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
