package com.springtutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AnotherInitHelloWorld implements BeanPostProcessor {

	   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		      System.out.println("Another BeforeInitialization : " + beanName);
		      return bean;  // you can return any other object as well
		   }

		   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		      System.out.println("Another AfterInitialization : " + beanName);
		      return bean;  // you can return any other object as well
		   }

}
