package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsSkuAttrValue;

import java.util.List;

public interface PmsSkuAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuAttrValue record);

    PmsSkuAttrValue selectByPrimaryKey(Long id);

    List<PmsSkuAttrValue> selectAll();

    int updateByPrimaryKey(PmsSkuAttrValue record);
}