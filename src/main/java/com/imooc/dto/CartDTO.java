package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * @author MQQ
 * @title: CartDTO
 * @projectName sell
 * @description: TODO
 * @date 2019/8/3014:18
 */
@Data
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
