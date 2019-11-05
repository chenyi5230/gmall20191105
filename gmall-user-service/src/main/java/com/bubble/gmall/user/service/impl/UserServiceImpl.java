package com.bubble.gmall.user.service.impl;

import com.bubble.gmall.bean.UmsMember;
import com.bubble.gmall.bean.UmsMemberReceiveAddress;
import com.bubble.gmall.service.UserService;
import com.bubble.gmall.user.mapper.UmsMemberMapper;
import com.bubble.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> selectAll() {
        return umsMemberMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddress(Long memberId) {
        return umsMemberReceiveAddressMapper.selectReceiveAddressByMemberId(memberId);
    }
}
