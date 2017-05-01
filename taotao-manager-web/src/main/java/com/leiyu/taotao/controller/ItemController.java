package com.leiyu.taotao.controller;

import com.leiyu.taotao.common.pojo.EasyUIDataGridResut;
import com.leiyu.taotao.pojo.TbItem;
import com.leiyu.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wh on 2017/4/18.
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId) {
        TbItem item = itemService.getItemById(itemId);
        return item;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    private EasyUIDataGridResut getItemList(Integer page,Integer rows){
        EasyUIDataGridResut resut = itemService.getItemList(page,rows);
        return resut;
    }

}
