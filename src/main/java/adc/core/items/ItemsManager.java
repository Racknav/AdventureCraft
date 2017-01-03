package adc.core.items;

import adc.api.core.IInitManager;

public class ItemsManager implements IInitManager {

	public static ItemRegistryCore coreItems;
	
	@Override
	public void preInitCommon() {
		// TODO Auto-generated method stub
		coreItems = new ItemRegistryCore();
	}

	@Override
	public void initCommon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInitCommon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInitClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initClient() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInitClient() {
		// TODO Auto-generated method stub
		
	}
	
	

}
