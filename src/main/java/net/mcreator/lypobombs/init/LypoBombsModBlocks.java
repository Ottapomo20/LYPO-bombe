
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lypobombs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lypobombs.block.PotatoBombBlock;
import net.mcreator.lypobombs.LypoBombsMod;

public class LypoBombsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LypoBombsMod.MODID);
	public static final RegistryObject<Block> POTATO_BOMB = REGISTRY.register("potato_bomb", () -> new PotatoBombBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
