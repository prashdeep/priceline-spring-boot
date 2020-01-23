package com.priceline.demo.service;

import com.priceline.demo.model.Item;
import com.priceline.demo.repository.ItemRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Profile("dev")
public class H2ServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public H2ServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    @Transactional
    public Item saveItem(Item item) {
        return this.itemRepository.save(item);
    }

    @Override
    public List<Item> listAll() {
        Iterable<Item> itemIterable = this.itemRepository.findAll();
        return null;
    }

    @Override
    public Item findById(long id) {
        return this.itemRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found "));
    }

    @Override
    public void deleteItem(long itemId) {
        Optional<Item> optionalItem = this.itemRepository.findById(itemId);
        optionalItem.ifPresent(this::deleteItem);


    }

    @Override
    public Item updateItem(long itemId, Item item) {
        return null;
    }

    private void deleteItem(Item item) {
        this.itemRepository.delete(item);
    }
}