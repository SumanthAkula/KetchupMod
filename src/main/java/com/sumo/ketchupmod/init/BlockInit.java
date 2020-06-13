package com.sumo.ketchupmod.init;

import com.sumo.ketchupmod.KetchupMod;
import com.sumo.ketchupmod.objects.blocks.TomatoCrop;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			KetchupMod.MOD_ID);

	public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
			() -> new TomatoCrop(Block.Properties.from(Blocks.WHEAT)));
}