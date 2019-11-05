package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.UmsMember;

import java.util.List;

public interface UmsMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    List<UmsMember> selectAll();

    int updateByPrimaryKey(UmsMember record);
}