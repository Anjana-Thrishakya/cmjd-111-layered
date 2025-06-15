/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;

import edu.ijse.layerd.dao.CrudUtil;
import edu.ijse.layerd.dao.custom.CustomerDao;
import edu.ijse.layerd.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Anjana
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(),
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvice(),
                t.getPostalCode());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustTitle = ?, CustName = ?, DOB= ?,"
                + "salary = ?, CustAddress= ?, City= ?, Province = ?, PostalCode = ? WHERE"
                + "CustID = ?",
                t.getTitle(),
                t.getName(),
                t.getDob(),
                t.getSalary(),
                t.getAddress(),
                t.getCity(),
                t.getProvice(),
                t.getPostalCode(),
                t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE from Customer WHERE CustID=?", id);
    }

    @Override
    public CustomerEntity search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
        if(rst.next()){
            return new CustomerEntity(
                    rst.getString("CustId"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"), 
                    rst.getString("DOB"),
                    rst.getDouble("salary"), 
                    rst.getString("CustAddress"), 
                    rst.getString("City"), 
                    rst.getString("Province"), 
                    rst.getString("PostalCode"));
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerEntity> customerEntities = new ArrayList<>();
        
        while (rst.next()) {            
            customerEntities.add(new CustomerEntity(
                    rst.getString("CustId"),
                    rst.getString("CustTitle"),
                    rst.getString("CustName"), 
                    rst.getString("DOB"),
                    rst.getDouble("salary"), 
                    rst.getString("CustAddress"), 
                    rst.getString("City"), 
                    rst.getString("Province"), 
                    rst.getString("PostalCode")));
        }
        return customerEntities;
    }
    
}
