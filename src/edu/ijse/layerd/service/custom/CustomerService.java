/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;

import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public interface CustomerService extends SuperService{
    public String saveCustomer(CustomerDto customerDto) throws Exception;
    public String updateCustomer(CustomerDto customerDto) throws Exception;
    public String deleteCustomer(String code) throws Exception;
    public CustomerDto searchCustomer(String code) throws Exception;
    public ArrayList<CustomerDto> getAllCustomer() throws Exception;
}
