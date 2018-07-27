package kr.co.infopub.chap037;
public class  ContinueTest1Chapt37
{
	public static void main(String[] args) 
	{
		for( int i=0; i<10;i++){
			if(i%2==0){
				continue;  //´ÙÀ½ ½ºÅÜ i
			}
			System.out.print(" [ "+i+" ] ");
		}//
	}
}
