package com.imarchuang.spring.remoting.rmi.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServerStarter {

	public static void main(String[] args) {
		 
        //RMI Server Application Context is started...
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("META-INF/rmiServerAppContext.xml");
		while(true){
			
		}
    }
}
