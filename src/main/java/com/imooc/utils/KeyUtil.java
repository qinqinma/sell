package com.imooc.utils;

import java.util.Random;

/**
 * @author MQQ
 * @title: KeyUtil
 * @projectName sell
 * @description: TODO
 * @date 2019/8/3014:06
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random=new Random();

        Integer number=random.nextInt(900000)+100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
