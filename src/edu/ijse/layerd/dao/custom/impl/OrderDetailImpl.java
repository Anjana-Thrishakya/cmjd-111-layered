/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.dao.custom.impl;

import edu.ijse.layerd.dao.CrudUtil;
import edu.ijse.layerd.dao.custom.OrderDetailDao;
import edu.ijse.layerd.entity.OrderDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class OrderDetailImpl implements OrderDetailDao{

    @Override
    public boolean save(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orderdetail VALUES(?,?,?,?)", 
                t.getOrderId(), t.getItemCode(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return true;
    }

    @Override
    public OrderDetailEntity search(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }
    
}
