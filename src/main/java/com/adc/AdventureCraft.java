package com.adc;

import java.util.ArrayList;
import java.util.List;

import com.adc.api.IManager;
import com.adc.config.Constants;
import com.adc.core.items.ItemsManager;
import com.adc.engine.proxy.ProxyCommon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.VERSION)
public class AdventureCraft {
	@Instance
	public static AdventureCraft instance;
	
	@SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide =  Constants.SERVER_PROXY)
	public static ProxyCommon proxy;
	
	public List<IManager> Managers = new ArrayList<IManager>();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		System.out.println("Blocks And Dragons: PreInit Phase");
		
		initManagers();
		
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		System.out.println("Blocks And Dragons: Init Phase");
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		System.out.println("Blocks And Dragons: PostInit Phase");
		proxy.postInit(e);
	}
	
	private void initManagers(){
		// Initalize all the managers here
		//Managers.add(new IManager());
		Managers.add(new ItemsManager());
	}
}
