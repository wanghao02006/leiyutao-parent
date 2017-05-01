package com.leiyu.taotao.service;

import com.leiyu.taotao.common.pojo.EasyUIDataGridResut;
import com.leiyu.taotao.pojo.TbItem;
import com.leiyu.taotao.pojo.TbItemDesc;

/**
 * Created by wh on 2017/4/17.
 */
public interface ItemService {

    TbItem getItemById(long itemId);

    EasyUIDataGridResut getItemList(Integer page,Integer rows);

}
