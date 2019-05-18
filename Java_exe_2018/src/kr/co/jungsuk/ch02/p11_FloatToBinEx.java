package kr.co.jungsuk.ch02;
class p11_FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수로 출력
	} // main의 끝
}
