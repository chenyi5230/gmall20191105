package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.OmsOrderItem;

import java.util.List;

public interface OmsOrderItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    OmsOrderItem selectByPrimaryKey(Long id);

    List<OmsOrderItem> selectAll();

    int updateByPrimaryKey(OmsOrderItem record);
}