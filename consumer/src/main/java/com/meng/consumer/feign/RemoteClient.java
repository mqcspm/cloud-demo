package com.meng.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider")
@Component
public interface RemoteClient {
    @RequestMapping("/hello/cloud")
    String index();
}
