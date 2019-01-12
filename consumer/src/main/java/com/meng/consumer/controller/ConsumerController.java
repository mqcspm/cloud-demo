package com.meng.consumer.controller;

import com.meng.consumer.feign.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    RemoteClient remoteClient;

    @RequestMapping("/")
    public String index(String invokName){
        return remoteClient.index(invokName);
    }

}
