package com.edamama.util;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

public class Util {
	
	public String getDriverPath() {
		System.out.println("Inside getDriverPath");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver.exe").getFile());
		
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath: "+absolutePath);
		return absolutePath;
	}
	
	public String getTestDataPath() throws URISyntaxException {
		System.out.println("Inside getTestDataPath");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("TestData1.xlsx").getFile());
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath: "+absolutePath);
		return absolutePath;
	}

}
