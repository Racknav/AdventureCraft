package adc.core.adventurer.capabilities.stats;

public class Stats implements IStats{
	
	private static final int[] expRequirements = {
			0,		1000, 	3000, 	6000, 	10000,	15000, 	21000, 	28000, 	36000, 	45000, 
			55000, 	66000, 	78000,	91000,	105000,	120000,	136000,	153000,	171000,	190000
	};
	
	private static final int[] statPointBoosts = {
			27, 0, 0, 1, 0, 0, 0, 1, 0, 0, 
			 0, 1, 0, 0, 0, 1, 0, 0, 0, 1
	};
	
	private int adventureExp, adventureLevel, statPoints;

	@Override
	public int getExp() {
		return adventureExp;
	}

	@Override
	public void setExp(int exp) {
		adventureExp = exp;
		
	}

	@Override
	public void addExp(int exp) {
		adventureExp += exp;
		for(int i = adventureLevel; i < expRequirements.length; i++) {
			if(adventureExp + 1 > expRequirements[i]){
				adventureLevel = i + 1;
				statPoints += statPointBoosts[i + 1];
			}
		}
		
	}

	@Override
	public int getLevel() {
		return adventureLevel;
	}

	@Override
	public int getStatPoints() {
		return statPoints;
	}

	@Override
	public void lowerStatPoints() {
		statPoints--;
	}

	@Override
	public void raiseStatPoints() {
		statPoints++;
	}
	
}
