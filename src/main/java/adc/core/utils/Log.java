package adc.core.utils;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import adc.core.config.Constants;

public class Log {
	
	private final static Logger LOGGER = Logger.getLogger(Constants.MOD_ID);
	
	public static void trace(String message, Object... params) {
		log(Level.FINE, message, params);
	}

	public static void debug(String message, Object... params) {
		log(Level.FINER, message, params);
	}

	public static void info(String message, Object... params) {
		log(Level.INFO, message, params);
	}

	public static void warning(String message, Object... params) {
		log(Level.WARNING, message, params);
	}

	public static void error(String message, Object... params) {
		log(Level.SEVERE, message, params);
	}

	private static void log(Level logLevel, String message, Object... params) {
		LOGGER.log(logLevel, message, params);
	}
}
