package com.adc.api;

public interface IManager {

	void preInitCommon();

	void initCommon();

	void postInitCommon();

	void preInitClient();

	void initClient();

	void postInitClient();

}
