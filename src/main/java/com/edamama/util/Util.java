package com.edamama.util;

import java.io.File;

public class Util {
	
	public String getDriverPath() {
		System.out.println("Inside getDriverPath");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver.exe").getFile());
		
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath: "+absolutePath);
		return absolutePath;
	}

}
