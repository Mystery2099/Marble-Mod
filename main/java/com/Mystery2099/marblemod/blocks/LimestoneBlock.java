package com.Mystery2099.marblemod.blocks;

import java.util.Random;

import com.Mystery2099.marblemod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class LimestoneBlock extends BlockBase {

	public LimestoneBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(1.0f);
		//setLightOpacity(1.0F);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.LIMESTONE_CHUNK;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 5;
		int min = 2;
		return rand.nextInt(max) + min;
	}
}

