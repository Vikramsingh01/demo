package com.meganexus.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	private static ReadProperties _instance = null;

	private static Properties props = null;

	private ReadProperties() {
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("config//test.properties"));
			props.load(fis);
		}

		catch (Exception e) {

		}
		// String propValue = ReadProperties.getInstance().getProperty(propKey)
		// System.out.println(props);
	}

	public synchronized static ReadProperties getInstance() {
		if (_instance == null)
			try {
				_instance = new ReadProperties();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return _instance;
	}

	public static String getProperty(String key) {
		getInstance();
		String value = null;
		if (props.containsKey(key))
			value = (String) props.get(key);

		else {
			 System.out.println("Value not found in property file");
		}
		return value;
	}

}
