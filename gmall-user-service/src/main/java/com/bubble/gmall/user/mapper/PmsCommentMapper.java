package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsComment;

import java.util.List;

public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    List<PmsComment> selectAll();

    int updateByPrimaryKey(PmsComment record);
}