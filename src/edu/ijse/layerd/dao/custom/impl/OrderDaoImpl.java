/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;

import edu.ijse.layerd.dao.CrudUtil;
import edu.ijse.layerd.dao.custom.OrderDao;
import edu.ijse.layerd.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean save(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", 
                t.getOrderId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return true;
    }

    @Override
    public OrderEntity search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }
    
}
