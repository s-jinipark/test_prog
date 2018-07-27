package kr.co.infopub.chap200.chat.server.test;

import kr.co.infopub.chap200.chat.server.ChatServer;

public class ChatServerMain {
	public static void main(String args[]){
		ChatServer cs=new ChatServer();
		cs.service();
	}
}
