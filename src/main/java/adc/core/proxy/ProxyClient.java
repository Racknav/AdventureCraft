package adc.core.proxy;

import adc.AdventureCraft;
import adc.api.core.IInitManager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ProxyClient extends ProxyCommon {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		for (IInitManager manager : AdventureCraft.instance.Managers) {
			manager.preInitClient();
		}
		
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		for (IInitManager manager : AdventureCraft.instance.Managers) {
			manager.initClient();
		}
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
		for (IInitManager manager : AdventureCraft.instance.Managers) {
			manager.postInitClient();
		}
	}
	
	@Override
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx));
	}
}
