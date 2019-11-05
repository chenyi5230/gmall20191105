package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseCatalog2;

import java.util.List;

public interface PmsBaseCatalog2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog2 record);

    PmsBaseCatalog2 selectByPrimaryKey(Integer id);

    List<PmsBaseCatalog2> selectAll();

    int updateByPrimaryKey(PmsBaseCatalog2 record);
}