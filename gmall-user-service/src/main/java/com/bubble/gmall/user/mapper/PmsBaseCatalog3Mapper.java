package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface PmsBaseCatalog3Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseCatalog3 record);

    PmsBaseCatalog3 selectByPrimaryKey(Long id);

    List<PmsBaseCatalog3> selectAll();

    int updateByPrimaryKey(PmsBaseCatalog3 record);
}