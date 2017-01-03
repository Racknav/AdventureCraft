package adc.core.items;

import net.minecraft.item.Item;

public class ItemRegistryCore extends ItemRegistry {

	public final ItemADC ItemTest;
	public final ItemADC GoldPiece;
	public final ItemADC GoldPurse;
	
	public ItemRegistryCore() {
		ItemTest = registerItem(new ItemADC(), "testItem");
		GoldPiece = registerItem(new ItemADC(), "goldPiece");
		GoldPurse = registerItem(new ItemADC(), "goldPurse");
	}
	
}
