package kr.co.jungsuk.ch11;
import java.util.*;
import java.io.*;

class P37_PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		try {
			//prop.store(new FileOutputStream("output.txt"), "Properties Example");
			//prop.storeToXML(new FileOutputStream("output.xml"),  "Properties Example");
			prop.store(new FileOutputStream("c:\\tmp\\test\\output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("c:\\\\tmp\\\\test\\\\output.xml"),  "Properties Example");

		} catch(IOException e) {
			e.printStackTrace();		
		}
	} // main의 끝
}
