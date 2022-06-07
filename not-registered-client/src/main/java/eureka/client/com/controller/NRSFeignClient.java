package eureka.client.com.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client-service1")
public interface NRSFeignClient {
    @RequestMapping("/hello1")
    String greeting();
}
