package kr.co.infopub.chap095;
public class StringVsStringBuffer {

	public static void main(String[] args) {
		String str=new String();
		StringBuffer sb=new StringBuffer();
		System.out.println(str.hashCode());  // 0
		str.concat("I").concat(" go").concat(" to shcool.");
		System.out.println(str.hashCode());  // 0
		str=str.concat("I").concat(" go").concat(" to shcool.");
		System.out.println(str.hashCode());  // ...(0 ¾Æ´Ô)
		System.out.println(sb.hashCode());   // ...(0 ¾Æ´Ô)
		sb.append("I")
		.append(" go")
		.append(" to shcool.");
		System.out.println(sb.toString());
		System.out.println(sb.hashCode()); //À§ÀÇ hashCode 
		replaces(str);//immutable *****
		reverse(sb);//mutable
		System.out.println(str);
		System.out.println(sb.toString());
	}
	public static void reverse(StringBuffer sb){
		sb.reverse();
	}
	public static void replaces(String sb){
		sb.concat("GoGo");
	}
}
