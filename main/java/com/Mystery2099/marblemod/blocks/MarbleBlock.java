package com.Mystery2099.marblemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MarbleBlock extends BlockBase
{
	public MarbleBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.5F);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(1.0f);
		//setLightOpacity(1.0F);
		//setBlockUnbreakable();
	}
}
