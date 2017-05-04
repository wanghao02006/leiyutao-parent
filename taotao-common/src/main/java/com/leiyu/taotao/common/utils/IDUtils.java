package com.leiyu.taotao.common.utils;

import java.util.Random;

/**
 * Created by wh on 2017/5/4.
 */
public class IDUtils {

    /**
     * 生成图片名称
     * @return
     */
    public static String genImageName(){
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end3 = random.nextInt(999);
        String str = millis + String.format("%03d",end3);
        return str;
    }

    public static long genItemId(){
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end2 = random.nextInt(99);
        String str = millis + String.format("%02d",end2);
        long id = Long.valueOf(str);
        return id;
    }



}
