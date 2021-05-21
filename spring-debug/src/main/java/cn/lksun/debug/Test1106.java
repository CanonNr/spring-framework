package cn.lksun.debug;

import cn.lksun.debug.entity.UserEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1106 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		UserEntity user = (UserEntity) ctx.getBean("userEntity");
		System.out.println("张三");
		user.name="张三";
		user.age=15;
		System.out.println(user.toString());
	}

}
