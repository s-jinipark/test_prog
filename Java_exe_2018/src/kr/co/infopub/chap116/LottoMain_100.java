package kr.co.infopub.chap116;
public class LottoMain_100 {

	public static void main(String[] args) {
		
		
		int[] ball =new int[6];
		
		int count=0;
		
		while (count<6) {
			int b = (int)(Math.random()*45)+1;
			//System.out.println(b);
			//ball[count++]=b;
			
			// 중복 제거
			boolean dup = false;
			for (int k=0; k<ball.length; k++) {
				if (b == ball[k]) {
					System.out.println("same : " + k + " / "+ b);
					dup = true;
					break;
				}	
			}
			if (!(dup)) {
				ball[count++]=b;
			}
		}
		
		for (int i=0; i<ball.length; i++) {
			System.out.println("["+ball[i]+"]");
		}
	}
}
