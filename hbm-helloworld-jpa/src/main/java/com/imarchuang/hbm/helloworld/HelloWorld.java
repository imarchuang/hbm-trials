package com.imarchuang.hbm.helloworld;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imarchuang.hbm.helloworld.persistence.JPAUtils;

public class HelloWorld {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello();
	}

	public void sayHello() {
		// First unit of work
//		Session session = JPAUtils.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
		EntityManager em = JPAUtils.getEMFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
		Message message = new Message("Hello World");
		em.persist(message);
		tx.commit();
		em.close();

		// Second unit of work
		getAllMessages();

		// Shutting down the application
		//JPAUtils.getSessionFactory().close();
		JPAUtils.getEMFactory().close();
	}

	private void getAllMessages() throws HibernateException {
//		Session newSession = JPAUtils.getSessionFactory().openSession();
//		Transaction newTransaction = newSession.beginTransaction();
		EntityManager em = JPAUtils.getEMFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
		//List<Message> messages = newSession.createQuery("from Message m order by m.text asc").list();
        List<Message> messages = em
                .createQuery("select m from Message m order by m.text asc")
                .getResultList();
        LOGGER.debug("{} message(s) found", messages.size());
		for (Message msg : messages) {
			LOGGER.debug(msg.toString());
		}
//		newTransaction.commit();
//		newSession.close();
		tx.commit();
        em.close();
	}
}
