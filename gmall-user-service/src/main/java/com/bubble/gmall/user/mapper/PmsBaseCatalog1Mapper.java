package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBaseCatalog1;

import java.util.List;

public interface PmsBaseCatalog1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog1 record);

    PmsBaseCatalog1 selectByPrimaryKey(Integer id);

    List<PmsBaseCatalog1> selectAll();

    int updateByPrimaryKey(PmsBaseCatalog1 record);
}