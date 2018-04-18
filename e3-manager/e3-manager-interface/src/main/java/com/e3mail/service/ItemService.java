package com.e3mail.service;

import com.e3mall.DTO.ItemDataGrid;
import com.yyk.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(Long id);
	ItemDataGrid getItemList(Integer pageIndex, Integer pageMax);
}
