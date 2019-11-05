package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsProductImage;

import java.util.List;

public interface PmsProductImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductImage record);

    PmsProductImage selectByPrimaryKey(Long id);

    List<PmsProductImage> selectAll();

    int updateByPrimaryKey(PmsProductImage record);
}