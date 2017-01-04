package adc;

import java.util.ArrayList;
import java.util.List;

import adc.api.core.AdventureCraftAPI;
import adc.api.core.IInitManager;
import adc.core.adventurer.capabilities.AdventurerCapabilityHandler;
import adc.core.config.Constants;
import adc.core.items.ItemsManager;
import adc.core.proxy.Proxies;
import adc.core.proxy.ProxyCommon;
import adc.core.utils.Log;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Constants.MOD_ID,
		name = Constants.MOD_NAME,
		version = Constants.VERSION,
		acceptedMinecraftVersions = "[1.10]",
		dependencies = "required-after:Forge@[12.18.1.2080,);")
public class AdventureCraft {
	
	@Mod.Instance(Constants.MOD_ID)
	public static AdventureCraft instance;
	
	public AdventureCraft() {
		AdventureCraftAPI.instance = this;
	}
	
	public List<IInitManager> Managers = new ArrayList<IInitManager>();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Log.info("Blocks And Dragons: PreInit Phase");
		initManagers();
		Proxies.common.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		Log.info("Blocks And Dragons: Init Phase");
		Proxies.common.init(e);
		Proxies.render.registerRenders(e);

		MinecraftForge.EVENT_BUS.register(new AdventurerCapabilityHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		Log.info("Blocks And Dragons: PostInit Phase");
		Proxies.common.postInit(e);
	}
	
	private void initManagers(){
		// Initalize all the managers here
		//Managers.add(new IManager());
		Managers.add(new ItemsManager());
	}
}
