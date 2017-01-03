package adc.core.items;

import java.util.List;

import adc.api.core.IItemModelRegister;
import adc.api.core.IModelManager;
import adc.core.CreativeTabADC;
import adc.core.utils.ItemTooltipUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ItemADC extends Item implements IItemModelRegister {
	
	public ItemADC() {
		setCreativeTab(CreativeTabADC.tabADC);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel(Item item, IModelManager manager) {
		manager.registerItemModel(item, 0);
	}
	
	public ItemStack getItemStack() {
		return new ItemStack(this);
	}
	
	public ItemStack getItemStack(int amount) {
		return new ItemStack(this, amount);
	}
	
	public ItemStack getWildcard() {
		return new ItemStack(this, 1, OreDictionary.WILDCARD_VALUE);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		ItemTooltipUtil.addInformation(stack, playerIn, tooltip, advanced);
	}

}
