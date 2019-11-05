package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsProductSaleAttrValue;

import java.util.List;

public interface PmsProductSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductSaleAttrValue record);

    PmsProductSaleAttrValue selectByPrimaryKey(Long id);

    List<PmsProductSaleAttrValue> selectAll();

    int updateByPrimaryKey(PmsProductSaleAttrValue record);
}