package adc.core.adventurer.capabilities.stats;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class StatsStorage implements IStorage<IStats> {

	@Override
	public NBTBase writeNBT(Capability<IStats> capability, IStats instance, EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readNBT(Capability<IStats> capability, IStats instance, EnumFacing side, NBTBase nbt) {
		// TODO Auto-generated method stub
		
	}

	

}
