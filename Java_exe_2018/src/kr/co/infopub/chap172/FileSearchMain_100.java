package kr.co.infopub.chap172;
public class FileSearchMain_100 {

	public static void main(String[] args) {
		FileSearch_100 fs=new FileSearch_100();
		try{
			//fs.printDirectory("c:\\");//"C:\"
			//fs.printDirectory("FileSearch.java");
			//fs.printDirectory("C:\\WINDOWS");
			
			//fs.printDirectory("D:\\dev\\IDE\\eclipse-jee-neon-3\\workspace\\java_test200\\src\\");
			//[2]
			fs.printDirectory("D:\\dev\\IDE\\eclipse-jee-neon-3\\workspace\\java_test200\\src\\",
					"CakeEater.java");
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
