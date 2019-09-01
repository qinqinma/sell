package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author MQQ
 * @title: SellException
 * @projectName sell
 * @description: TODO
 * @date 2019/8/3013:45
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
