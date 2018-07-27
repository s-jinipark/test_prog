package kr.co.infopub.chap199;
import java.io.*;
import java.net.*;
import java.util.Vector;
public class ChatServer {
  ServerSocket ss;   //java.net
  Socket s;          //java.net
  Vector<Thread> v;          //Vector<Thread> v
  public ChatServer(){
    v=new Vector<>(5,5);//v=new Vector<Thread>(5,5);
	System.out.println("서버가 시작되었습니다.");
  }
  public void giveAndTake(){
    try{
      ss=new ServerSocket(5420);
	  ss.setReuseAddress(true) ;//ServerSocket port 바로 다시사용
      while(true){
        s=ss.accept();
        ServerSocketThread svrth=new ServerSocketThread(this,s);
        addClient(svrth);
        svrth.start();
      }
    }catch(Exception ee){ee.printStackTrace();}
  }
  public synchronized void addClient(Thread tr){
    v.add(tr);
	System.out.println("Client 1명 입장, 총 "+v.size()+"명");
  }
  public synchronized void removeClient(Thread tr){
    v.remove(tr);
	System.out.println("Client 1명 퇴장 총 "+v.size()+"명");
  }
  public synchronized void broadCasting(String sbc){
      for(int i=0;i<v.size();i++){
          ServerSocketThread svtr=(ServerSocketThread)v.get(i);
          svtr.sendMessage(sbc);
      }
  }
}