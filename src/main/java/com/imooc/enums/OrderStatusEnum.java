package com.imooc.enums;

import lombok.Getter;

/**
 * @author MQQ
 * @title: OrderStatusEnum
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2921:04
 */
@Getter
public enum  OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
