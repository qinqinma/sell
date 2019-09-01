package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * @author MQQ
 * @title: BuyerService
 * @projectName sell
 * @description: TODO
 * @date 2019/8/3021:10
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
