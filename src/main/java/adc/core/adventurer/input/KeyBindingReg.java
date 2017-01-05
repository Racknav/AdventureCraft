package adc.core.adventurer.input;

import org.lwjgl.input.Keyboard;

import adc.AdventureCraft;
import adc.core.adventurer.AdventurerCore;
import adc.core.adventurer.gui.GuiAttributesInterface;
import adc.core.network.GuiHandlerADC;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KeyBindingReg {
public static KeyBinding StatsInterface;
	
	public static void init() {
		MinecraftForge.EVENT_BUS.register(new KeyBindingReg());
		
		StatsInterface = new KeyBinding("key.StatsInterface", Keyboard.KEY_P, "key.bnd.main");
		ClientRegistry.registerKeyBinding(StatsInterface);
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void playerTick(PlayerTickEvent event)
	{
		if (event.side == Side.SERVER) return;
		if (event.phase == Phase.START)
		{
			Minecraft mc = Minecraft.getMinecraft();
			if (StatsInterface.isKeyDown())
			{
				if (!(mc.currentScreen instanceof GuiAttributesInterface))
					event.player.openGui(AdventureCraft.instance, GuiHandlerADC.ATTRIBUTES_GUI, mc.theWorld, (int) event.player.posX, (int) event.player.posY, (int) event.player.posZ);
			}
		}
	}

}
