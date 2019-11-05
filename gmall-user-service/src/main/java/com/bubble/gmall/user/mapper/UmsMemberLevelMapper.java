package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.UmsMemberLevel;

import java.util.List;

public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    List<UmsMemberLevel> selectAll();

    int updateByPrimaryKey(UmsMemberLevel record);
}