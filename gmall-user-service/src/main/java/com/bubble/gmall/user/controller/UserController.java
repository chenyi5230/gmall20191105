package com.bubble.gmall.user.controller;

import com.bubble.gmall.bean.UmsMember;
import com.bubble.gmall.bean.UmsMemberReceiveAddress;
import com.bubble.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMemberList = userService.selectAll();
        return umsMemberList;
    }

    @RequestMapping("/getAddress")
    public List<UmsMemberReceiveAddress> getAddress(Long memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getAddress(memberId);
        return umsMemberReceiveAddressList;
    }


}
