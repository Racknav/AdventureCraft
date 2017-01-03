package com.adc.engine.proxy;

import com.adc.AdventureCraft;
import com.adc.api.IManager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ProxyCommon {

	public void preInit(FMLPreInitializationEvent e) {
		for (IManager manager : AdventureCraft.instance.Managers) {
			manager.preInitCommon();
		}
	}

	public void init(FMLInitializationEvent e) {
		for (IManager manager : AdventureCraft.instance.Managers) {
			manager.initCommon();
		}
	}

	public void postInit(FMLPostInitializationEvent e) {
		for (IManager manager : AdventureCraft.instance.Managers) {
			manager.postInitCommon();
		}
	}
	
	/**
	 * Returns a side-appropriate EntityPlayer for use during message handling
	 */
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity;
	}

}
