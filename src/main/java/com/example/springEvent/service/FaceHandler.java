package com.example.springEvent.service;

import com.example.springEvent.event.FaceEvent;
import com.example.springEvent.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class FaceHandler {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void handle(){
        User user = new User();
        user.setAge(34);
        user.setUserName("人脸事件");
        user.setHobby("抓拍");
        //发布事件
        applicationEventPublisher.publishEvent(new FaceEvent(user));
        //进行其他业务处理
    }

}
