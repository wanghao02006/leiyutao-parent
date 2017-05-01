package com.leiyu.taotao.service;

import com.leiyu.taotao.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by wh on 2017/4/23.
 */
public interface ItemCatService {

    List<EasyUITreeNode> getItemcatList(long parentid);

}
