package kr.co.infopub.chap172;

import java.io.File;
import java.io.IOException;
public class RecuseDirectoryReader {

	public static void main(String[] args) {
		
		try {
			readDirectory("c:\\");
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("End");
	}

	
	
	public static void readDirectory(String fname) throws IOException{
		File f=new File(fname);
		if(f.isDirectory()){
			System.out.println("------------------------");
			System.out.println(f.getAbsolutePath());
			File []fs= f.listFiles();
			for(int i=0; i<fs.length;i++){
				if(fs[i].isDirectory()){
					//readDirectory(fs[i].getAbsoluteFile().getAbsolutePath());
					System.out.println(fs[i].getAbsoluteFile());//절대경로
				}
			}
		}
	}
}
