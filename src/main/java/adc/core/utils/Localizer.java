package adc.core.utils;

import java.util.IllegalFormatException;

import net.minecraft.util.text.translation.I18n;

public class Localizer {
	public static String ConvertToLocal(String key) {
		if (I18n.canTranslate(key)) {
			return I18n.translateToLocal(key);
		} else {
			return I18n.translateToFallback(key);
		}
	}

	public static boolean canConvertToLocal(String key) {
		return I18n.canTranslate(key);
	}

	public static String ConvertToLocalFormatted(String key, Object... format) {
		String s = ConvertToLocal(key);
		try {
			return String.format(s, format);
		} catch (IllegalFormatException e) {
			String errorMessage = "Format error: " + s;
			Log.error(errorMessage, e);
			return errorMessage;
		}
	}
}
