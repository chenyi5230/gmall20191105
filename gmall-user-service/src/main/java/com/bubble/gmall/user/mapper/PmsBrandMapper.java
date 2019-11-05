package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.PmsBrand;

import java.util.List;

public interface PmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand record);

    PmsBrand selectByPrimaryKey(Long id);

    List<PmsBrand> selectAll();

    int updateByPrimaryKey(PmsBrand record);
}