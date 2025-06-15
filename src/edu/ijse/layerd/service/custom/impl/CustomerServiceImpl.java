/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.CustomerDao;
import edu.ijse.layerd.dto.CustomerDto;
import edu.ijse.layerd.entity.CustomerEntity;
import edu.ijse.layerd.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class CustomerServiceImpl implements CustomerService{
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(), 
                customerDto.getName(),customerDto.getDob(),
                customerDto.getSalary(),customerDto.getAddress(), customerDto.getCity(),
                customerDto.getProvice(), customerDto.getPostalCode());
        
        return customerDao.save(entity)? "Success" : "Fail";
        
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity entity = new CustomerEntity(
                customerDto.getId(),
                customerDto.getTitle(), 
                customerDto.getName(),customerDto.getDob(),
                customerDto.getSalary(),customerDto.getAddress(), customerDto.getCity(),
                customerDto.getProvice(), customerDto.getPostalCode());
        
        return customerDao.update(entity)? "Success" : "Fail";
    }

    @Override
    public String deleteCustomer(String code) throws Exception {
        return customerDao.delete(code) ? "Success": "Fail"; 
    }

    @Override
    public CustomerDto searchCustomer(String code) throws Exception {
        CustomerEntity entity = customerDao.search(code);
        if(entity != null) {
            return new CustomerDto(entity.getId(),
                    entity.getTitle(), entity.getName(), entity.getDob(),
                    entity.getSalary(), entity.getAddress(), entity.getCity(),
                    entity.getProvice(), entity.getPostalCode());
        } 
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
       ArrayList<CustomerDto> customerDtos = new ArrayList<>();
       
       ArrayList<CustomerEntity> customerEntities = customerDao.getAll();
       customerEntities.forEach(entity-> {
           customerDtos.add(new CustomerDto(entity.getId(),
                    entity.getTitle(), entity.getName(), entity.getDob(),
                    entity.getSalary(), entity.getAddress(), entity.getCity(),
                    entity.getProvice(), entity.getPostalCode()));
       });
       
       return customerDtos;
    }
}
