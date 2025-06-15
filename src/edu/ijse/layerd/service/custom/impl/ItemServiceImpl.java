/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dao.DaoFactory;
import edu.ijse.layerd.dao.custom.ItemDao;
import edu.ijse.layerd.dao.custom.impl.ItemDaoImpl;
import edu.ijse.layerd.dto.ItemDto;
import edu.ijse.layerd.entity.ItemEntity;
import edu.ijse.layerd.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
                itemDto.getDesc(), itemDto.getPack(),
                itemDto.getUnitPrice(), itemDto.getQoh());

        return itemDao.save(itemEntity) ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
                itemDto.getDesc(), itemDto.getPack(),
                itemDto.getUnitPrice(), itemDto.getQoh());

        return itemDao.update(itemEntity) ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String id) throws Exception {
        return itemDao.delete(id) ? "Success" : "Fail";
    }

    @Override
    public ItemDto searchItem(String id) throws Exception {
        ItemEntity itemEntity = itemDao.search(id);
        if (itemEntity != null) {
            return new ItemDto(itemEntity.getCode(), itemEntity.getDesc(),
                    itemEntity.getPack(), itemEntity.getUnitPrice(),
                    itemEntity.getQoh());
        }

        return null;

    }

    @Override
    public ArrayList<ItemDto> getALlItem() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntities = itemDao.getAll();

        for (ItemEntity itemEntity : itemEntities) {
            itemDtos.add(new ItemDto(itemEntity.getCode(), itemEntity.getDesc(),
                    itemEntity.getPack(), itemEntity.getUnitPrice(),
                    itemEntity.getQoh()));
        }

        return itemDtos;
    }

}
