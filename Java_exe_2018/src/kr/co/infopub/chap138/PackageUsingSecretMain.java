package kr.co.infopub.chap138;

import kr.co.infopub.chap138.one.MyMotherSecret;
import kr.co.infopub.chap138.two.MyTopSecret;

public class PackageUsingSecretMain {

	public static void main(String[] args) {
		MyMotherSecret mother=new MyMotherSecret();
		MyTopSecret my=new MyTopSecret();
		//private,(default),protected가 안보임
		System.out.println(mother.getSlushMoney());//public
		System.out.println(mother);//public
		System.out.println(my.getSlushMoney());//public
		System.out.println(my);//public
	}
}
