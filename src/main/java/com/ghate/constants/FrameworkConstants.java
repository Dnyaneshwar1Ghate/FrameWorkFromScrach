package com.ghate.constants;

public final class FrameworkConstants {
	
	private static final String firefoxPath="F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe"; 
	private static final String ConfigFilePath=System.getProperty("user.dir")+"/src/test/resources/config/config.properties"; 

	
	public static String getFirepath()
	{
		//System.out.println(ConfigFilePath);
		return firefoxPath;

	}

	public static String getConfigfilepath() {
		return ConfigFilePath;
	}
}
