package adc.core.proxy;

import java.util.ArrayList;
import java.util.List;

import adc.core.utils.Log;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ProxyRenderClient extends ProxyRender {

	private final List<Item> quedItemsForRender = new ArrayList<Item>();
	
	@Override
	public void queRegisterRender(Item item) {
		quedItemsForRender.add(item);
	}
	
	@Override
	public void registerRenders(FMLInitializationEvent e) {
		for (Item quedItem : quedItemsForRender) {
			registerRender(quedItem);
		}
	}
	
	private void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Log.info("Register Render: " + item.getRegistryName());
	}
}
