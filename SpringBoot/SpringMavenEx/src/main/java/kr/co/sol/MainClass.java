package kr.co.sol;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
//	TransPortationWalk tpw = new TransPortationWalk();
//	tpw.Move();
	
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
	TransPortationWalk tpw = ctx.getBean("tWalk", TransPortationWalk.class);
	tpw.Move();
	ctx.close();
}
}
