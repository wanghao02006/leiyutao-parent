package com.leiyu.taotao.service;

import com.leiyu.taotao.common.pojo.PictureResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wh on 2017/5/1.
 */
public interface PictureService {

    PictureResult uploadPic(MultipartFile picFile);
}
