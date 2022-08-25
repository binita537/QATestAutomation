package com.orangehrm.commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.orangehrm.frameworkconstant.FrameworkConstants;

public final class PropertiesFileUtils {

	private PropertiesFileUtils() {

	}

	private static Properties PROPERTY = new Properties();
	private static final HashMap<String, String> PROPERTIES_VALUE = new HashMap<String, String>();

	static {

		try {
			FileInputStream FIS = new FileInputStream(FrameworkConstants.getApplicationPropertitesPath());
			PROPERTY.load(FIS);

			for (Map.Entry<Object, Object> propentry : PROPERTY.entrySet()) {
				PROPERTIES_VALUE.put(String.valueOf(propentry.getKey()), String.valueOf(propentry.getValue()));

			}

			// Used Java 8 Lamda function consumer which take as input and perform action
			// PROPERTY.entrySet().forEach(entry->PROPERTIES_VALUE.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getValueFromPropertiesFile(String key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(PROPERTIES_VALUE.get(key))) {
			throw new Exception("Properties value" + key + "is not found . please check if it null");

		}

		return PROPERTIES_VALUE.get(key);

	}

}
