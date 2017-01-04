package adc.core.adventurer.capabilities.skills;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class SkillsStorage implements IStorage<ISkills> {

	@Override
	public NBTBase writeNBT(Capability<ISkills> capability, ISkills instance, EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readNBT(Capability<ISkills> capability, ISkills instance, EnumFacing side, NBTBase nbt) {
		// TODO Auto-generated method stub

	}

}
