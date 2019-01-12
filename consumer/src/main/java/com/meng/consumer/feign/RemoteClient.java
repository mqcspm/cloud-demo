package com.meng.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider")
@Component
public interface RemoteClient {

    /**
     * 传参时，保证参数名称和提供者参数名称一样
     * @param invokName
     * @return
     */
    @RequestMapping("/hello/cloud")
    String index(@RequestParam(value = "invokName") String invokName);
}
