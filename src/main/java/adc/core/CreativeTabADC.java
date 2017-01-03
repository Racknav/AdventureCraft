package adc.core;

import adc.core.config.Constants;
import adc.core.items.ItemsManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabADC {
	public static final CreativeTabs tabADC = new CreativeTabs(Constants.MOD_ID){
		@Override
		public Item getTabIconItem() {
			return ItemsManager.coreItems.ItemTest;
		}
	};
}
