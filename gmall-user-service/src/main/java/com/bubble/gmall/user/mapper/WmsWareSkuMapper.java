package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.WmsWareSku;

import java.util.List;

public interface WmsWareSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareSku record);

    WmsWareSku selectByPrimaryKey(Long id);

    List<WmsWareSku> selectAll();

    int updateByPrimaryKey(WmsWareSku record);
}