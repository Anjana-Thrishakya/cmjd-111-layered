/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;

import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.service.ServiceFactory;
import edu.ijse.layerd.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class CustomerController {
    
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.saveCustomer(customerDto);
    }
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.updateCustomer(customerDto);
    }
    
    public String deleteCustomer(String id) throws Exception{
        return customerService.deleteCustomer(id);
    }
    
    public CustomerDto searchCustomer(String id) throws Exception{
        return customerService.searchCustomer(id);
    }
    
    public ArrayList<CustomerDto> getAllCustomer() throws Exception{
        return customerService.getAllCustomer();
    }
}
