package com.ghate.util;

import java.io.FileInputStream;
import java.util.Properties;

public final class ReadPropertyFile {

	private ReadPropertyFile()
	{

	}

	public static String getValue(String key) throws Exception
	{
		Properties property=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty(("user.dir")+"src/test/resources/config/config.properties"));
		property.load(file);
		String value=property.getProperty(key);
		if(value==null)
		{
			throw new Exception("Property name"+key+"is not found , please check config.properties file ");
			
		}
		return value;
		 


	}
}
