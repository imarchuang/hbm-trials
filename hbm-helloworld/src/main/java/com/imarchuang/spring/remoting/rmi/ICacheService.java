package com.imarchuang.spring.remoting.rmi;

import java.util.concurrent.ConcurrentHashMap;

import com.imarchuang.spring.remoting.rmi.server.Transferrable;

public interface ICacheService {

	/**
     * Get Transferrable Map
     * 
     * @return ConcurrentHashMap Transferrable Map
     */

    public ConcurrentHashMap<Long, Transferrable> getTransMap();
}
