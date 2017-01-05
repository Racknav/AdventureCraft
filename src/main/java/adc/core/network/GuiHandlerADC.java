package adc.core.network;

import adc.core.adventurer.gui.GuiAttributesInterface;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandlerADC implements IGuiHandler{

	public static final int ATTRIBUTES_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ATTRIBUTES_GUI)
			return new GuiAttributesInterface(player);
		return null;
	}
	
}
