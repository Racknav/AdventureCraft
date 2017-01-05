package adc.core.adventurer.capabilities.stats;

public interface IStats {
	public int getExp();
	public void setExp(int exp);
	public void addExp(int exp);
	
	public int getLevel();
	
	public int getStatPoints();
	public void lowerStatPoints();
	public void raiseStatPoints();
	
	public void setFirstSet(boolean value);
	public boolean isFirstSet();
}
