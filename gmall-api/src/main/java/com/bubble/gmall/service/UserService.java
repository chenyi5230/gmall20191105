package com.bubble.gmall.service;

import com.bubble.gmall.bean.UmsMember;
import com.bubble.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> selectAll();

    List<UmsMemberReceiveAddress> getAddress(Long memberId);
}
