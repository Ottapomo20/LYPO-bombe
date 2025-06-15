
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lypobombs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.lypobombs.LypoBombsMod;

public class LypoBombsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LypoBombsMod.MODID);
	public static final RegistryObject<CreativeModeTab> LYPO_BOMBS_TAB = REGISTRY.register("lypo_bombs_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lypo_bombs.lypo_bombs_tab")).icon(() -> new ItemStack(Blocks.TNT)).displayItems((parameters, tabData) -> {
				tabData.accept(LypoBombsModBlocks.POTATO_BOMB.get().asItem());
			}).build());
}
