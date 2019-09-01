package com.imooc.service.impl;

import com.imooc.config.UpYunConfig;
import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author MQQ
 * @title: ProductServiveImpl
 * @projectName sell
 * @description: TODO
 * @date 2019/8/2917:55
 */
@Service
public class ProductServiveImpl implements ProductService {

    @Autowired
    private  ProductInfoRepository repository;
    @Autowired
    private UpYunConfig upYunConfig;

    @Override
    public ProductInfo findOne(String productId) {
        Optional<ProductInfo> productInfoOptional=repository.findById(productId);
//        if (productInfoOptional.isPresent()) {
//            return productInfoOptional.get().addImageHost(upYunConfig.getImageHost());
//        }
//        return null;
        productInfoOptional.ifPresent(e->e.addImageHost(upYunConfig.getImageHost()));
        return productInfoOptional.orElse(null);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            ProductInfo productInfo=repository.findById(cartDTO.getProductId()).get();
            if(productInfo==null)
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            Integer result=cartDTO.getProductQuantity()+productInfo.getProductStock();
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }


    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            ProductInfo productInfo=repository.findById(cartDTO.getProductId()).get();
            if(productInfo==null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result=productInfo.getProductStock()-cartDTO.getProductQuantity();
            if(result<0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }
}
