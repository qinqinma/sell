package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.GsonBuildConfig;

/**
 * @author MQQ
 * @title: JsonUtil
 * @projectName sell
 * @description: TODO
 * @date 2019/9/121:07
 */
public class JsonUtil {
    public  static String toJson(Object object){
        GsonBuilder gsonBuilder=new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson=gsonBuilder.create();
        return gson.toJson(object);

    }
}
