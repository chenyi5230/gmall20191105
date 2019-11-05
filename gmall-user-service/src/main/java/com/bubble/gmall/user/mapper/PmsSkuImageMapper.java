package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsSkuImage;

import java.util.List;

public interface PmsSkuImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuImage record);

    PmsSkuImage selectByPrimaryKey(Long id);

    List<PmsSkuImage> selectAll();

    int updateByPrimaryKey(PmsSkuImage record);
}