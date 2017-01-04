package adc.core.adventurer.capabilities.attributes;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class AttributesProvider implements ICapabilitySerializable<NBTBase> {

    @CapabilityInject(IAttributes.class)
    public static final Capability<IAttributes> ATTRIBUTES_CAP = null;
    
    private IAttributes instance = ATTRIBUTES_CAP.getDefaultInstance();

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == ATTRIBUTES_CAP;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == ATTRIBUTES_CAP ? ATTRIBUTES_CAP.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return ATTRIBUTES_CAP.getStorage().writeNBT(ATTRIBUTES_CAP, this.instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		ATTRIBUTES_CAP.getStorage().readNBT(ATTRIBUTES_CAP, this.instance, null, nbt);
	}
	
}
