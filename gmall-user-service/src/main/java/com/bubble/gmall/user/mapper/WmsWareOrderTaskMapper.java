package com.bubble.gmall.user.mapper;

import com.bubble.gmall.bean.WmsWareOrderTask;

import java.util.List;

public interface WmsWareOrderTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    List<WmsWareOrderTask> selectAll();

    int updateByPrimaryKey(WmsWareOrderTask record);
}