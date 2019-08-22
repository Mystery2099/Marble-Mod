package com.Mystery2099.marblemod.init;

import java.util.ArrayList;
import java.util.List;

import com.Mystery2099.marblemod.blocks.BlockBase;
import com.Mystery2099.marblemod.blocks.EarthQuartzBlock;
import com.Mystery2099.marblemod.blocks.LimestoneBlock;
import com.Mystery2099.marblemod.blocks.MarbleBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block LIMESTONE_BLOCK = new LimestoneBlock("limestone_block", Material.ROCK);
	public static final Block MARBLE_BLOCK = new MarbleBlock("marble_block", Material.ROCK);
	public static final Block EARTH_QUARTZ_ORE = new EarthQuartzBlock("earth_quartze_ore", Material.ROCK);
}
