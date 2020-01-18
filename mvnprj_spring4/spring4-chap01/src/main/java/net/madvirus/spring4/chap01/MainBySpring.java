package net.madvirus.spring4.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBySpring {
	/*
	 - 스프링은 ApplicationContext 라는 인터페이스를 통해 컨테이너가 제공해야 할
	      기본 기능을 정의하고 있다
	 - AbstractApplicationContext 는 컨테이너 종료(ctx.close..)와 같은
	      관리 기능을 제공하고 있다
	 - GenericXmlApplicationContext 는 AbstractApplicationContext 를
	      상속받아 만들어진 클래스로서 XML 파일에서 스프링 빈 설정 정보를 읽어 온다
	 */
	public static void main(String[] args) {
		String configLocation = "classpath:applicationContext.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLocation);
		Project project = ctx.getBean("sampleProject", Project.class);
		project.build();
		ctx.close();
	}
}
