package com.ghate.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ReadPropertyFile {

	private ReadPropertyFile()
	{

	}
	private static Properties property=new Properties();

	static {
		try
		{
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
			property.load(file);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public static String getValue(String key1) throws Exception
	{
		String value=property.getProperty(key1);
		if(value==null)
		{
			throw new Exception("Property name"+key1+"is not found , please check config.properties file ");
			
		}
		return value;
		 


	}
}
