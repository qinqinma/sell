package com.imooc.enums;

import lombok.Getter;

/**
 * @author MQQ
 * @title: PayStatusEnum
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2921:07
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
