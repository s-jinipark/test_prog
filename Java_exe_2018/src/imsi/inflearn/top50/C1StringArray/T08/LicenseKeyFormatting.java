package imsi.inflearn.top50.C1StringArray.T08;

public class LicenseKeyFormatting {

	public static void main(String[] args) {

		String S = "5F3Z-2e-9-w";
//		String S = "2-5g-3-J";
		int k = 4;
		System.out.println(licenseKeyFormatting(S, k));
	}

	public static String licenseKeyFormatting(String S, int K) {

		// 1 하이픈제거, 대문자
		// 2 끝에서 k자리(4자리) 끊기
		String S1 = S.replace("-", "");
		S1 = S1.toUpperCase();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < S1.length(); i++) {
			
			sb.append(S1.charAt(i));

		}
		
		// 끝에서 4 자리 끊기 **
		int len = sb.toString().length();
		for (int i = K; i < len; i = i + K) {
			sb.insert(len - i, '-');
		}
		return sb.toString();
	}
}
