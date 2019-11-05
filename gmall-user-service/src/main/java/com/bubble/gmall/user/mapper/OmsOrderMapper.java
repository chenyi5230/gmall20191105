package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.OmsOrder;

import java.util.List;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    List<OmsOrder> selectAll();

    int updateByPrimaryKey(OmsOrder record);
}