package com.leiyu.taotao.service.impl;

import com.leiyu.taotao.mapper.TbItemMapper;
import com.leiyu.taotao.pojo.TbItem;
import com.leiyu.taotao.pojo.TbItemExample;
import com.leiyu.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wh on 2017/4/18.
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem item = itemMapper.selectByPrimaryKey(itemId);
//        TbItemExample example = new TbItemExample();
//        //创建查询条件
//        TbItemExample.Criteria criteria = example.createCriteria();
//        criteria.andIdEqualTo(itemId);
//        List<TbItem> list = itemMapper.selectByExample(example);
//        //判断list中是否为空
//        TbItem item = null;
//        if (list != null && list.size() > 0) {
//            item = list.get(0);
//        }
        return item;

    }
}
