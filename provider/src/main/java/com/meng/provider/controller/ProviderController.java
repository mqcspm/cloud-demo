package com.meng.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/hello/cloud")
    public String index(String invokName){
        return invokName +  " say hello spring cloud";
    }
}
