package com.plm.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.plm.item.bean.Item;

//@RepositoryRestResource(path="item1")
public interface ItemRepository  extends JpaRepository<Item, String>{

}
