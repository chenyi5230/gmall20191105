package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsProductInfo;

import java.util.List;

public interface PmsProductInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductInfo record);

    PmsProductInfo selectByPrimaryKey(Long id);

    List<PmsProductInfo> selectAll();

    int updateByPrimaryKey(PmsProductInfo record);
}