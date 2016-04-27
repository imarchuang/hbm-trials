package com.imarchuang.spring.remoting.rmi.server;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imarchuang.spring.remoting.rmi.ICacheService;
import com.imarchuang.spring.remoting.rmi.ITransferrableService;

public class RMITransferrableService implements ITransferrableService {

	private static Logger logger = LoggerFactory.getLogger(RMITransferrableService.class);
		
	//Remote Cache Service is injected...
    ICacheService cacheService;
	
	@Override
	public boolean addTransferrable(Transferrable transferrable) {
		getCacheService().getTransMap().put(transferrable.getId(), transferrable);
        logger.debug("User has been added to cache. User : "
        		+getCacheService().getTransMap().get(transferrable.getId()));
        return true;
	}

	@Override
	public boolean deleteTransferrable(Transferrable transferrable) {
		getCacheService().getTransMap().put(transferrable.getId(), transferrable);
        logger.debug("User has been deleted from cache. User : "+transferrable);
        return true;
	}

	@Override
	public List<Transferrable> getTransferrableList() {
		List<Transferrable> list = new ArrayList<Transferrable>();
        list.addAll(getCacheService().getTransMap().values());
        logger.debug("User List : "+list);
        return list;
	}
	
	/**
     * Get Cache Service
     *
     * @return cacheService
     */
    public ICacheService getCacheService() {
        return cacheService;
    }
 
    /**
     * Set Cache Service
     *
     * @param cacheService
     */
    public void setCacheService(ICacheService cacheService) {
        this.cacheService = cacheService;
    }

}
