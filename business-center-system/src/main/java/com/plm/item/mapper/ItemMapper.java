package com.plm.item.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plm.item.bean.Item;

@Mapper
public interface ItemMapper {
	int delete(String id);

    int insert(Item record); 

    Item select(String id);

    int update(Item record);
    
    List<Item> list();
}
