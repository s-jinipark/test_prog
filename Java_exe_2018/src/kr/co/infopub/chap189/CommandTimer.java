package kr.co.infopub.chap189;
public  class CommandTimer extends HTimer {
	public synchronized void commit(){
		System.out.println(new java.util.Date()+": !!!");
	}
}
