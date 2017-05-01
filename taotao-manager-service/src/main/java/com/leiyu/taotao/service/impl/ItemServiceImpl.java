package com.leiyu.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leiyu.taotao.common.pojo.EasyUIDataGridResut;
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

    @Override
    public EasyUIDataGridResut getItemList(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);

        EasyUIDataGridResut resut = new EasyUIDataGridResut(pageInfo.getTotal(),list);
        return resut;
    }
}
