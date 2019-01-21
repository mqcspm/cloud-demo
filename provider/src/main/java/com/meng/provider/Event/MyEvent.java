package com.meng.provider.Event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private String invokName;

    public MyEvent(Object source, String invokName) {
        super(source);
        this.invokName = invokName;
    }

    public String getInvokName() {
        return invokName;
    }
}
