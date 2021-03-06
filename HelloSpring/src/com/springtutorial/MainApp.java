package com.springtutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditor obj = (TextEditor) context.getBean("te");
		obj.checkSpelling();
		context.registerShutdownHook();
	}
}