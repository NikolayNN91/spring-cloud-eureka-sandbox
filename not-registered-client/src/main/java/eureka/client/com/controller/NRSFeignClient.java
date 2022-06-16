package eureka.client.com.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-service1")
public interface NRSFeignClient {
    @GetMapping("/hello1")
    String greeting();
}
