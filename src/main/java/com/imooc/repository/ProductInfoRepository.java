package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author MQQ
 * @title: ProductInfoRepository
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2917:40
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer peoductStatus);

}
