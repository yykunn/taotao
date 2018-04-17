package com.e3mail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mail.service.ItemService;
import com.yyk.mapper.TbItemMapper;
import com.yyk.pojo.TbItem;
import com.yyk.pojo.TbItemExample;
import com.yyk.pojo.TbItemExample.Criteria;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	TbItemMapper tbItemMapper;

	@Override
	public TbItem getItemById(Long id) {
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
