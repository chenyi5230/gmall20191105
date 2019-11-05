package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.OmsCartItem;

import java.util.List;

public interface OmsCartItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    OmsCartItem selectByPrimaryKey(Long id);

    List<OmsCartItem> selectAll();

    int updateByPrimaryKey(OmsCartItem record);
}