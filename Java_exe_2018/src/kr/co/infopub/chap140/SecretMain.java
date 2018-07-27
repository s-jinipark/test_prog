package kr.co.infopub.chap140;

import kr.co.infopub.chap138.one.MyMotherFriendSecret;
import kr.co.infopub.chap138.one.MyMotherSecret;
import kr.co.infopub.chap138.one.MySistersSecret;
import kr.co.infopub.chap138.two.MyTopSecret;

public class SecretMain {

	public static void main(String[] args) {
		MyMotherSecret mother=new MyMotherSecret();
		MySistersSecret sister=new MySistersSecret();
		MyMotherFriendSecret mofriend=new MyMotherFriendSecret();
		MyTopSecret my=new MyTopSecret();
		//private,(default),protected가 안보임
		System.out.println(mother.getSlushMoney());//public
		System.out.println(mother);//public
		System.out.println(sister.getSlushMoney());//public
		System.out.println(sister);//public
		mofriend.seeMyMother(mother);//아줌마가 아는 엄마 비밀
		System.out.println(mofriend);//public
		System.out.println(mofriend.getAddress());//public
		System.out.println(my);//public
		System.out.println(my.getSlushMoney());//public
	}
}
