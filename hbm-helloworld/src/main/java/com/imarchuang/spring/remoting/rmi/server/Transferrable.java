package com.imarchuang.spring.remoting.rmi.server;

import java.io.Serializable;

public class Transferrable implements Serializable {

	private long id;
    private String name;
 
    /**
     * Get  Id
     *
     * @return long id
     */
    public long getId() {
        return id;
    }
 
    /**
     * Set  Id
     *
     * @param long id
     */
    public void setId(long id) {
        this.id = id;
    }
 
    /**
     * Get  Name
     *
     * @return long id
     */
    public String getName() {
        return name;
    }
 
    /**
     * Set  Name
     *
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Id : ").append(getId());
        strBuilder.append(", Name : ").append(getName());
        return strBuilder.toString();
    }
    
}
