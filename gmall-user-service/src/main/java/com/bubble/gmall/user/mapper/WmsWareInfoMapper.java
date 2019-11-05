package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.WmsWareInfo;

import java.util.List;

public interface WmsWareInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareInfo record);

    WmsWareInfo selectByPrimaryKey(Long id);

    List<WmsWareInfo> selectAll();

    int updateByPrimaryKey(WmsWareInfo record);
}