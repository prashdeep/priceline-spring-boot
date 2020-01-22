package com.priceline.demo.dao;


import com.priceline.demo.model.Item;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryItemDaoImpl implements ItemDao {

    private static List<Item> items  = Arrays.asList(
            Item.builder().id(1000).name("Iphone").price(40000).build(),
            Item.builder().id(1100).name("Iphone- X").price(40000).build());



    @Override
    public Item saveItem(Item item) {
        item.setId(Math.round(Math.ceil(Math.random()*1000)));
        //items.add(item);
        return item;
    }

    @Override
    public List<Item> listAll() {
        return this.items;
    }

    @Override
    public Optional<Item> findById(long id) {
        Optional<Item> element = this.items.stream().filter(item -> item.getId() == id).findFirst();
        return element;

    }

    @Override
    public void deleteItem(long itemId) {
        this.items.removeIf(item -> item.getId() == itemId);
    }

    @Override
    public Item updateItem(long itemId, Item item) {
        Optional<Item> element = this.items.stream().filter(i -> i.getId() == itemId).findFirst();
        if (element.isPresent()){
            Item returnItem = element.get();
            returnItem.setDescription(item.getDescription());
            returnItem.setName(item.getName());
            returnItem.setPrice(item.getPrice());
        }
        return item;
    }
}