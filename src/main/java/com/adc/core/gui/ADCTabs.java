package com.adc.core.gui;

import com.adc.config.Constants;
import com.adc.core.items.ItemsRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ADCTabs {
	public static final CreativeTabs tabADCCore = new CreativeTabs(Constants.MOD_ID){
		@Override
		public Item getTabIconItem() {
			return ItemsRegistry.TEST_ITEM;
		}
	};
}
