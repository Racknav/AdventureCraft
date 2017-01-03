package com.adc.core.items;

import com.adc.config.Constants;
import com.adc.core.gui.ADCTabs;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ADCItem extends Item {
	public ADCItem(String unlocalizedName, String registryName)
	{
		setUnlocalizedName(Constants.MOD_ID + "." + unlocalizedName);
		setRegistryName(registryName);
		GameRegistry.register(this);
		setCreativeTab(ADCTabs.tabADCCore);
	}
}
