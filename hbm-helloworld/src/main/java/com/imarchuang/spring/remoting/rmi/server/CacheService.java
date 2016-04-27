package com.imarchuang.spring.remoting.rmi.server;

import java.util.concurrent.ConcurrentHashMap;

import com.imarchuang.spring.remoting.rmi.ICacheService;

public class CacheService implements ICacheService {

	private ConcurrentHashMap<Long, Transferrable> transMap;
	
	@Override
	public ConcurrentHashMap<Long, Transferrable> getTransMap() {
		return transMap;
	}
	
	/**
     * Set Transferrable Map
     *
     * @param ConcurrentHashMap Transferrable Map
     */
    public void setTransMap(ConcurrentHashMap<Long, Transferrable> transMap) {
        this.transMap = transMap;
    }

}
