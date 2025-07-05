package com.Skillio.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public static void main(String[] args) throws IOException {
		String baseDir=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(baseDir+"C:\\Users\\krebi\\OneDrive\\Desktop\\Automation_project\\FrameWork\\src\\main\\java\\com\\Skillio\\utils.FileUtils.java");
		Properties prop=new Properties();
		prop.load(fis);
		prop.getProperty("cityname_1");
		
	}

}
