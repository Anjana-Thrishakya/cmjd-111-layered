/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layerd.service.custom;

import edu.ijse.layerd.dto.ItemDto;
import edu.ijse.layerd.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public interface ItemService extends SuperService{
    
    public String saveItem(ItemDto itemDto) throws Exception;
    public String updateItem(ItemDto itemDto) throws Exception;
    public String deleteItem(String id) throws Exception;
    public ItemDto searchItem(String id) throws Exception;
    public ArrayList<ItemDto> getALlItem() throws Exception;
    
}
