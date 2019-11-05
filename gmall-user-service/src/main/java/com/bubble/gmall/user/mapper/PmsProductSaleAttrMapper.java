package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface PmsProductSaleAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductSaleAttr record);

    PmsProductSaleAttr selectByPrimaryKey(Long id);

    List<PmsProductSaleAttr> selectAll();

    int updateByPrimaryKey(PmsProductSaleAttr record);
}