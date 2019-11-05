package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.WmsWareOrderTaskDetail;

import java.util.List;

public interface WmsWareOrderTaskDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTaskDetail record);

    WmsWareOrderTaskDetail selectByPrimaryKey(Long id);

    List<WmsWareOrderTaskDetail> selectAll();

    int updateByPrimaryKey(WmsWareOrderTaskDetail record);
}