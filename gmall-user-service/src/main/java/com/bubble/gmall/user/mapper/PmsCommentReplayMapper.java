package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsCommentReplay;

import java.util.List;

public interface PmsCommentReplayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    PmsCommentReplay selectByPrimaryKey(Long id);

    List<PmsCommentReplay> selectAll();

    int updateByPrimaryKey(PmsCommentReplay record);
}