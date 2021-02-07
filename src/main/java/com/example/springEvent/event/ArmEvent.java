package com.example.springEvent.event;

import org.springframework.context.ApplicationEvent;

public class ArmEvent extends ApplicationEvent {
    public ArmEvent(Object source) {
        super(source);
    }
}
