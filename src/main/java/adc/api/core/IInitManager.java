package adc.api.core;

public interface IInitManager {

	void preInitCommon();

	void initCommon();

	void postInitCommon();

	void preInitClient();

	void initClient();

	void postInitClient();

}
