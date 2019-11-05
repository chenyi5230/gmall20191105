package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberReceiveAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    List<UmsMemberReceiveAddress> selectAll();

    int updateByPrimaryKey(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(Long memberId);
}