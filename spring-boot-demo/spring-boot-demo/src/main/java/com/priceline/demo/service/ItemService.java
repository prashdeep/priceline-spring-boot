package com.priceline.demo.service;

import com.priceline.demo.model.Item;

import java.util.List;

public interface ItemService {

    Item saveItem(Item item);

    List<Item> listAll();

    Item findById(long id);

    void deleteItem(long itemId);

    Item updateItem(long itemId, Item item);
}