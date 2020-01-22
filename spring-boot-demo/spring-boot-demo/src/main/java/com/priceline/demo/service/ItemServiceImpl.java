package com.priceline.demo.service;


import com.priceline.demo.dao.ItemDao;
import com.priceline.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;

    public ItemServiceImpl(ItemDao itemDao){
        this.itemDao = itemDao;
    }

    @Override
    public Item saveItem(Item item) {
        return this.itemDao.saveItem(item);
    }

    @Override
    public List<Item> listAll() {
        return this.itemDao.listAll();

    }

    @Override
    public Item findById(long id) {
        return this.itemDao.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void deleteItem(long itemId) {
        this.itemDao.deleteItem(itemId);
    }

    @Override
    public Item updateItem(long itemId, Item item) {
        return this.itemDao.updateItem(itemId, item);
    }
}