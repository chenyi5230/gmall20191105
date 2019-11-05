package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsSkuSaleAttrValue;

import java.util.List;

public interface PmsSkuSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuSaleAttrValue record);

    PmsSkuSaleAttrValue selectByPrimaryKey(Long id);

    List<PmsSkuSaleAttrValue> selectAll();

    int updateByPrimaryKey(PmsSkuSaleAttrValue record);
}