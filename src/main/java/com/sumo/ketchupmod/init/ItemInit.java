package com.sumo.ketchupmod.init;

import com.sumo.ketchupmod.KetchupMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, KetchupMod.MOD_ID);

	// FIXME: fix french_fry texture
	public static final RegistryObject<Item> FRENCH_FRY = ITEMS.register("french_fry", () -> new Item(
			new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder().setAlwaysEdible().hunger(6).build())));
	public static final RegistryObject<Item> KETCUP_BOTTLE = ITEMS.register("ketchup_bottle",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD)));
	public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

	public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
			() -> new BlockItem(BlockInit.TOMATO_CROP.get(), new Item.Properties().group(ItemGroup.MISC)));
}