package adc.api.core;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IItemModelRegister {
	
	@SideOnly(Side.CLIENT)
	void registerModel(Item item, IModelManager manager);
}
