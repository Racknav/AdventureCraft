package adc.core.adventurer.capabilities.attributes;

public interface IAttributes {
	
	public int getBaseAttribute(EAttributes attribute);
	public int getCurrentAttribute(EAttributes attribute);
	
	public void setBaseAttribute(EAttributes attribute, int value);
	public void setCurrentAttribute(EAttributes attribute, int value);
	
	public void resetCurrentAttribute(EAttributes attribute);
}
