package com.test.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-demo-consumer.xml"}
        );
		 context.start();
		 DemoService demoService = (DemoService) context.getBean("demoService");
		 String Result = demoService.helloWorld();

		 // show the result

		 System.out.println(Result);
	}

}
