package com.priceline.demo.controller;


import com.priceline.demo.model.Item;
import com.priceline.demo.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/items/")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Item saveItem(@Valid  @RequestBody Item item){
        return this.itemService.saveItem(item);
    }

    @GetMapping()
    public List<Item> listAll(){
        return this.itemService.listAll();
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable("id") long id){
        return this.itemService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable("id") long id){
        this.itemService.deleteItem(id);
    }

}

