package com.Mystery2099.marblemod.tabs;

import com.Mystery2099.marblemod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MarbleTab extends CreativeTabs 
{
	public MarbleTab(String label) { super("marbletab");
	this.setBackgroundImageName("marbletab.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.LIMESTONE_BLOCK);}
}