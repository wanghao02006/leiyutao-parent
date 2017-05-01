package com.leiyu.taotao.controller;

import com.leiyu.taotao.common.pojo.PictureResult;
import com.leiyu.taotao.common.utils.JsonUtils;
import com.leiyu.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wh on 2017/5/1.
 */
@Controller

public class PictureController {

    @Autowired
    private PictureService pictureService = null;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadFile(MultipartFile uploadFile) {
        PictureResult result = pictureService.uploadPic(uploadFile);
        String json = JsonUtils.objectToJson(result);
        return json;
    }

}
