package com.example.springEvent.listerner;

import com.example.springEvent.event.ArmEvent;
import com.example.springEvent.event.FaceEvent;
import com.example.springEvent.pojo.User;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnnonationListener {
    @EventListener({FaceEvent.class})
    @Order(4)
    public void onApplicationEvent4(FaceEvent event) {
        User user = (User) event.getSource();
        String name = Thread.currentThread().getName();
        System.out.println("===> A收到人脸事件:  {"+user.getUserName()+"}，线程名为： {"+name+"}");
    }

    @EventListener({FaceEvent.class,ArmEvent.class})
    @Order(3)
    public void onApplicationEvent3(Object event) {
        if(event instanceof FaceEvent){
            FaceEvent faceEvent = (FaceEvent) event;
            System.out.println("===> B 收到人脸事件:"+faceEvent.toString());
        }else if(event instanceof ArmEvent){
            ArmEvent armEvent = (ArmEvent) event;
            System.out.println("===> B 收到臂膀事件:"+armEvent.toString());
        }
    }
}
