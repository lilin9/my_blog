package com.lilin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by LiLin on 2022/9/11/13:28:58
 */
public class PathUtils {
    public static String generateFilePath(String fileName) {
        //根据日期生成路径 2022/9/11
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String datePath = sdf.format(new Date());
        //uuid 作为文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        //后缀和文件名后缀一致
        int index = fileName.lastIndexOf(".");
        //test.jpg --> .jpg
        String  fileType = fileName.substring(index);
        return datePath + uuid + fileType;
    }
}