package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author MQQ
 * @title: ProductStatusEnum
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2918:00
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;;
    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
