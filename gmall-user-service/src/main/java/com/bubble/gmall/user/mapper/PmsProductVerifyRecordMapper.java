package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsProductVerifyRecord;

import java.util.List;

public interface PmsProductVerifyRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVerifyRecord record);

    PmsProductVerifyRecord selectByPrimaryKey(Long id);

    List<PmsProductVerifyRecord> selectAll();

    int updateByPrimaryKey(PmsProductVerifyRecord record);
}