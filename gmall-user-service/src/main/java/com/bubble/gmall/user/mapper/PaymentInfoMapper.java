package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PaymentInfo;

import java.util.List;

public interface PaymentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PaymentInfo record);

    PaymentInfo selectByPrimaryKey(Long id);

    List<PaymentInfo> selectAll();

    int updateByPrimaryKey(PaymentInfo record);
}