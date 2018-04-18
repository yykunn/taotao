package com.e3mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mail.service.ItemService;
import com.e3mall.DTO.ItemDataGrid;
import com.yyk.pojo.TbItem;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;

	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getById(@PathVariable Long itemId) {
		return itemService.getItemById(itemId);
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public ItemDataGrid getItemList(Integer page, Integer rows) {
		return itemService.getItemList(page, rows);
	}
}
