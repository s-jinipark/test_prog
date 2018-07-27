package kr.co.infopub.chap173;
public class FileDirectoryMakingMain {

	public static void main(String[] args) {
		FileDirectoryMaking fm=new FileDirectoryMaking();
		System.out.println(fm.make("aaa"));
		System.out.println(fm.make("bbb"));
		System.out.println(fm.renameTo("aaa","ccc"));
		System.out.println(fm.delete("ccc"));
		//결국 bbb디렉토리만 남는다.
	}
}
