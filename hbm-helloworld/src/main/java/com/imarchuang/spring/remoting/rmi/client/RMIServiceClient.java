package com.imarchuang.spring.remoting.rmi.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imarchuang.spring.remoting.rmi.ITransferrableService;
import com.imarchuang.spring.remoting.rmi.server.Transferrable;

public class RMIServiceClient {

	private static Logger logger = LoggerFactory.getLogger(RMIServiceClient.class);
	
	 public static void main(String[] args) {
		 
	        logger.debug("RMI Service Client is starting...");
	 
	        //RMI Client Application Context is started...
	        ApplicationContext context = 
	        		new ClassPathXmlApplicationContext("META-INF/rmiClientAppContext.xml");
	 
	        //Remote User Service is called via RMI Client Application Context...
	        ITransferrableService rmiClient = (ITransferrableService) context.getBean("RMITransferrableService");
	 
	        //New User is created...
	        Transferrable trans = new Transferrable();
	        trans.setId(1);
	        trans.setName("Bruce");
	 
	        //The user is added to the remote cache...
	        rmiClient.addTransferrable(trans);
	 
	        //The users are gotten via remote cache...
	        rmiClient.getTransferrableList();
	 
	        //The user is deleted from remote cache...
	        rmiClient.deleteTransferrable(trans);

	    }
}
