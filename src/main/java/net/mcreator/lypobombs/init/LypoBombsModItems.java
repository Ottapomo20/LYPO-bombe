
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lypobombs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lypobombs.LypoBombsMod;

public class LypoBombsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LypoBombsMod.MODID);
	public static final RegistryObject<Item> POTATO_BOMB = block(LypoBombsModBlocks.POTATO_BOMB);
	public static final RegistryObject<Item> NETHER_BOMB = block(LypoBombsModBlocks.NETHER_BOMB);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
