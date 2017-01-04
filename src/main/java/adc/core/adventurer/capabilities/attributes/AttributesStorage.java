package adc.core.adventurer.capabilities.attributes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class AttributesStorage implements IStorage<IAttributes> {

	@Override
	public NBTBase writeNBT(Capability<IAttributes> capability, IAttributes instance, EnumFacing side) {
		// TODO WriteNBT for Attributes
		return null;
	}

	@Override
	public void readNBT(Capability<IAttributes> capability, IAttributes instance, EnumFacing side, NBTBase nbt) {
		// TODO ReadNBT for Attributes

	}

}
