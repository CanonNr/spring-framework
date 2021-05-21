package cn.lksun.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1106 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml","service.xml");

		Object abb = ctx.getBean("abb");
		System.out.println("end.....");

	}

}
