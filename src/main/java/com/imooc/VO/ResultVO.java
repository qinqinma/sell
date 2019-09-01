package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的最外部对象
 * @author MQQ
 * @title: ResultVO
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2918:38
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
