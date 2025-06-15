/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service;

import edu.ijse.layerd.service.custom.impl.CustomerServiceImpl;
import edu.ijse.layerd.service.custom.impl.ItemServiceImpl;

/**
 *
 * @author Anjana
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceTypes type){
        switch (type) {
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ORDER:
                return null;
            default:
                throw new AssertionError();
        }
    }
    
    public enum ServiceTypes{
        CUSTOMER, ITEM, ORDER
    }
}
