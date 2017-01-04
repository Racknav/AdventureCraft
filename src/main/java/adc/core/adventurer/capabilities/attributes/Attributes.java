package adc.core.adventurer.capabilities.attributes;

import java.util.EnumMap;
import java.util.Map;

public class Attributes implements IAttributes {

	private EnumMap<EAttributes, Integer> baseAttributes;
	private EnumMap<EAttributes, Integer> currentAttributes;
	
	public Attributes()
	{
		baseAttributes = new EnumMap<EAttributes, Integer>(EAttributes.class);
		currentAttributes = new EnumMap<EAttributes, Integer>(EAttributes.class);
		
		for (EAttributes att : EAttributes.values()) {
			baseAttributes.put(att, 8);
			currentAttributes.put(att, 8);
		}
	}
	
	@Override
	public int getBaseAttribute(EAttributes attribute) {
		return baseAttributes.get(attribute);
	}

	@Override
	public int getCurrentAttribute(EAttributes attribute) {
		return currentAttributes.get(attribute);
	}

	@Override
	public void setBaseAttribute(EAttributes attribute, int value) {
		int v = value < 0 ? 0 : value;
		baseAttributes.put(attribute, v);
	}

	@Override
	public void setCurrentAttribute(EAttributes attribute, int value) {
		int v = value < 0 ? 0 : value;
		currentAttributes.put(attribute, v);
	}

	@Override
	public void resetCurrentAttribute(EAttributes attribute) {
		setCurrentAttribute(attribute, getBaseAttribute(attribute));
	}

}
