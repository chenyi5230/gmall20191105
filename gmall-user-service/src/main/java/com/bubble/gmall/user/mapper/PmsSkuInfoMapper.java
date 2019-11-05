package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsSkuInfo;

import java.util.List;

public interface PmsSkuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuInfo record);

    PmsSkuInfo selectByPrimaryKey(Long id);

    List<PmsSkuInfo> selectAll();

    int updateByPrimaryKey(PmsSkuInfo record);
}