package kr.co.infopub.chap185;
public class  StaticPrint implements Runnable{
	private static int i=0; //
	public void run(){show();}
	public void show(){
		for(  ;i<500;i++){
			if(((Thread.currentThread()).getName()).equals("a") ){
				System.out.print("a");
			}else if(((Thread.currentThread()).getName()).equals("b") ){
				System.out.print("b");
			}else if(((Thread.currentThread()).getName()).equals("c") ){
				System.out.print("c");
			}
		}
	}
}
