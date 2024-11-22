package com.ghate.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.ghate.constants.FrameworkConstants;

/**
 * @author Lenovo
 *
 */
public final class ReadPropertyFile {

	private ReadPropertyFile()
	{

	}
	private static Properties property=new Properties();
	private static final Map <String ,String> configMap=new HashMap<>();
	

	static {
		try
		{
			FileInputStream file=new FileInputStream(FrameworkConstants.getConfigfilepath());
			property.load(file);
			
			
//			for(Object key:property.keySet())
//			{
//				configMap.put(String.valueOf(key), String.valueOf(property.get(key)));		
//			}
			
			
			//for(Map.Entry<Object, Object> entry:property.entrySet())
			//{
			//	configMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			//}
			
			////lambda expression ADDED
			property.entrySet().forEach(entry ->configMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
			
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static String getValue(String key) throws Exception
	{
		if(Objects.isNull(key) || Objects.isNull(configMap.get(key)))
		{
			throw new Exception("Property name"+ key +"is not found , please check config.properties file ");
		}
		return configMap.get(key);
	}
	
//	 public static String getValue(String key1) throws Exception {
//	  
//	 if(Objects.isNull(property.getProperty(key1)) || Objects.isNull(key1)) 
//	 {
//		 throw new Exception("Property name"+key1+"is not found , please check config.properties file ");
//	  
//	  } return property.getProperty(key1);
//	  
//	  
//	  
//	  }
	 
}
