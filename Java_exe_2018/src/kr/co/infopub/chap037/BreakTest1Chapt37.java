package kr.co.infopub.chap037;
public class  BreakTest1Chapt37
{
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++){
			aa:{  //가능하면 사용을 줄이자
				System.out.println("i ==>"+i);
				for(int j=0;j<2;j++){
					if(i%5==1 || i%5==2){
						System.out.println("i :"+i+"  j:"+j);
					}else break aa;
				}// for
			}// aa:
		}// for
	}
}
