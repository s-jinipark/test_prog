package kr.co.infopub.chap053;

public class Recurs {

	public static int P(int n, int r){
		int tot=0;
		if(r==0){
			tot=1;
		}else{
			tot=(n-r+1)*P(n,r-1);
		}
		return tot;
	}
	public static int C(int n, int r){
		int tot=0;
		if(r==0){
			tot=1;
		}else{
			tot=(n-r+1)*C(n,r-1)/r;
		}
		return tot;
	}
}
