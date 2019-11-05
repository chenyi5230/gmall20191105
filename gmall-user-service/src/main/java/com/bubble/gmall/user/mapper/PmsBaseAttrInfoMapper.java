package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface PmsBaseAttrInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrInfo record);

    PmsBaseAttrInfo selectByPrimaryKey(Long id);

    List<PmsBaseAttrInfo> selectAll();

    int updateByPrimaryKey(PmsBaseAttrInfo record);
}