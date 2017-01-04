package adc.core.adventurer.capabilities.skills;

public interface ISkills {

	public int getSkill(ESkills skill);
	public void setSkill(ESkills skill, int value);
	
	public boolean hasSpecialty(String specialty);
	public void addSpecialty(String specialty);
	public void removeSpecialty(String specialty);
	
}
