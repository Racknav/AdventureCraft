package adc.core.items;

import javax.annotation.Nonnull;

import adc.core.proxy.Proxies;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public abstract class ItemRegistry {
	protected static <T extends Item> T registerItem(T item, String name) {
		item.setUnlocalizedName("adc." + name);
		item.setRegistryName(name);
		
		GameRegistry.register(item);
		Proxies.render.queRegisterRender(item);
		
		return item;
	}
	
	protected static void registerOreDict(String oreDictName, ItemStack itemStack) {
		OreDictionary.registerOre(oreDictName, itemStack);
	}
	
	@Nonnull
	public static ItemStack createItemForOreName(String oreName) {
		ItemStack oreItem = new ItemStack(registerItem(new ItemADC(), oreName));
		OreDictionary.registerOre(oreName, oreItem);
		return oreItem;
	}
}
