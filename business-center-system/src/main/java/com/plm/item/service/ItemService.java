package com.plm.item.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plm.item.bean.Item;
import com.plm.item.mapper.ItemMapper;

@Service
public class ItemService {
    
    @Autowired
    private ItemMapper mapper;

    public List<Item> list(){
         return mapper.list();
    }

    public int add(Item item) {
        return mapper.insert(item);
    }

    public Item select(String id) {
        return mapper.select(id);
    }

    public int delete(String id) {
        return mapper.delete(id);
    }
    
    public int update(Item item) {
        return mapper.update(item);
    }
}
