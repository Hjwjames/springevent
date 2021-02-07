package com.example.springEvent.listerner;

import com.example.springEvent.event.FaceEvent;
import com.example.springEvent.pojo.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FaceEventListener implements ApplicationListener<FaceEvent> {
    @Override
    public void onApplicationEvent(FaceEvent event) {
        User user = (User) event.getSource();
        System.out.println("===> 收到人脸事件:  {"+user.getUserName()+"}");
        // .....
        System.out.println("人脸事件处理结束。。。");
    }
}
