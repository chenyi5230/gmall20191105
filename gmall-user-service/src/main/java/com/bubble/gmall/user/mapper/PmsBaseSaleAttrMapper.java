package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface PmsBaseSaleAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseSaleAttr record);

    PmsBaseSaleAttr selectByPrimaryKey(Long id);

    List<PmsBaseSaleAttr> selectAll();

    int updateByPrimaryKey(PmsBaseSaleAttr record);
}