package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.OmsCompanyAddress;

import java.util.List;

public interface OmsCompanyAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsCompanyAddress record);

    OmsCompanyAddress selectByPrimaryKey(Long id);

    List<OmsCompanyAddress> selectAll();

    int updateByPrimaryKey(OmsCompanyAddress record);
}