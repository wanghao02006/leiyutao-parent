package com.leiyu.taotao.service.impl;

import com.leiyu.taotao.common.pojo.EasyUITreeNode;
import com.leiyu.taotao.mapper.TbItemCatMapper;
import com.leiyu.taotao.pojo.TbItemCat;
import com.leiyu.taotao.pojo.TbItemCatExample;
import com.leiyu.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wh on 2017/4/23.
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemcatList(long parentid) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<TbItemCat> lists = tbItemCatMapper.selectByExample(example);
        if(null == lists || lists.size() == 0){
            return null;
        }else {
            List<EasyUITreeNode> treeNodes = new ArrayList<>();
            for(TbItemCat cat : lists){
                EasyUITreeNode treeNode = new EasyUITreeNode();
                treeNode.setId(cat.getId());
                treeNode.setText(cat.getName());
                treeNode.setState(cat.getIsParent() ? "closed" : "open");
                treeNodes.add(treeNode);
            }
            return treeNodes;
        }
    }
}
