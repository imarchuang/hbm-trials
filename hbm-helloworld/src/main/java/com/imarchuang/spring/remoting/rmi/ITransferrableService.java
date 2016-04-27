package com.imarchuang.spring.remoting.rmi;

import java.util.List;

import com.imarchuang.spring.remoting.rmi.server.Transferrable;

public interface ITransferrableService {

	/**
     * Add Transferrable
     *
     * @param  Transferrable Transferrable
     * @return boolean response of the method
     */
    public boolean addTransferrable(Transferrable transferrable);
 
    /**
     * Delete Transferrable
     *
     * @param  Transferrable Transferrable
     * @return boolean response of the method
     */
    public boolean deleteTransferrable(Transferrable transferrable);
 
    /**
     * Get Transferrable List
     *
     * @return List Transferrable list
     */
    public List<Transferrable> getTransferrableList();
    
}
