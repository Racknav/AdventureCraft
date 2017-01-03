package com.adc.core.items;

import com.adc.api.IManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemsManager implements IManager {

	@Override
	public void preInitCommon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCommon() {
		// TODO Auto-generated method stub
		ItemsRegistry.initItems();
		
	}

	@Override
	public void postInitCommon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInitClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initClient() {
		// TODO Auto-generated method stub
		ItemsRegistry.registerRenders();
		
	}

	@Override
	public void postInitClient() {
		// TODO Auto-generated method stub
		
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		System.out.println("Register Render: " + item.getRegistryName());
	}

}
