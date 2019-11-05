package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface PmsBaseAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    List<PmsBaseAttrValue> selectAll();

    int updateByPrimaryKey(PmsBaseAttrValue record);
}