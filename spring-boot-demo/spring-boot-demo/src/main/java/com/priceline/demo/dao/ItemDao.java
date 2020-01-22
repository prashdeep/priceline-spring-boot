package com.priceline.demo.dao;

import com.priceline.demo.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemDao {

    Item saveItem(Item item);

    List<Item> listAll();

    Optional<Item> findById(long id);

    void deleteItem(long itemId);

    Item updateItem(long itemId, Item item);

}