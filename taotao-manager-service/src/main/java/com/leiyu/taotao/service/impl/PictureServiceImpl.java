package com.leiyu.taotao.service.impl;

import com.leiyu.taotao.common.pojo.PictureResult;
import com.leiyu.taotao.common.utils.FastDFSClient;
import com.leiyu.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wh on 2017/5/1.
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;

    @Override
    public PictureResult uploadPic(MultipartFile picFile) {
        PictureResult result = new PictureResult();
        //判断图片是否为空
        if (picFile.isEmpty()) {
            result.setError(1);
            result.setMessage("图片为空");
            return result;
        }
        //上传到图片服务器
        try {
            //取图片扩展名
            String originalFilename = picFile.getOriginalFilename();
            //取扩展名不要“.”
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            FastDFSClient client = new FastDFSClient("classpath:properties/client.conf");
            String url = IMAGE_SERVER_BASE_URL + client.uploadFile(picFile.getBytes(), extName);
            System.out.println(url);
            //把url响应给客户端
            result.setError(0);
            result.setUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(1);
            result.setMessage("图片上传失败");
        }
        return result;

    }
}
