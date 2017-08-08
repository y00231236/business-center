package com.plm.item.controller;

import java.util.List;

import org.business.common.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.plm.item.bean.Item;
import com.plm.item.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService service;
	
	@RequestMapping("/list")
	public List<Item> list() {
		return service.list();
	}

	@RequestMapping("/{id}")
	public Item view(@PathVariable("id") String id) {
		return service.select(Strings.trim(id));
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int add(@RequestBody Item Item) {
		return service.add(Item);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int update(@RequestBody Item Item) {
		return service.update(Item);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public int delete(@PathVariable("id") String id) {
		return service.delete(id);
	}
}
