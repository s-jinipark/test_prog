package kr.co.infopub.chap182;
public class MyThread extends Thread
{
	public void run(){
		for(int i=0;i<500;i++){
			System.out.print("T");
		}
	}
}
