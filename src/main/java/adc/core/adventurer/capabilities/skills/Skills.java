package adc.core.adventurer.capabilities.skills;

import java.util.EnumMap;
import java.util.List;

public class Skills implements ISkills {

	private EnumMap<ESkills, Integer>  baseSkills;
	private List<String> specialties;
	
	@Override
	public int getSkill(ESkills skill) {
		return baseSkills.get(skill);
	}
	@Override
	public void setSkill(ESkills skill, int value) {
		baseSkills.put(skill, value);
	}
	@Override
	public boolean hasSpecialty(String specialty) {
		return baseSkills.containsKey(specialty);
	}
	@Override
	public void addSpecialty(String specialty) {
		if(!hasSpecialty(specialty)) {
			specialties.add(specialty);
		}
		
	}
	@Override
	public void removeSpecialty(String specialty) {
		if(hasSpecialty(specialty)) {
			specialties.remove(specialty);
		}
	}
	
	
}
