package com.meng.provider.controller;

import com.meng.provider.Event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    ApplicationContext applicationContext;
    @RequestMapping("/hello/cloud")
    public String index(String invokName){
        applicationContext.publishEvent(new MyEvent(this, invokName));
        return invokName +  " say hello spring cloud";
    }
}
