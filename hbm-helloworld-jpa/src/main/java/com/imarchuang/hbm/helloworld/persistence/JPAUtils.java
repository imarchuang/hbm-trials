package com.imarchuang.hbm.helloworld.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

	private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("helloworldPersistenceUnit");
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEMFactory() {
        // Alternatively, you could look up in JNDI here
        return emf;
    }
}
