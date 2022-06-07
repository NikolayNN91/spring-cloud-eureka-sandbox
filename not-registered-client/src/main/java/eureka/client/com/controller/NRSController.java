package eureka.client.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NRSController {

    @Autowired(required = false)
    public RestTemplate restTemplate;

    @Autowired
    public NRSFeignClient NRSFeignClient;

    @GetMapping
    public String hello() {
        return "Not registered service";
    }

    @GetMapping("/byFc")
    public String hello1Feign() {
        return NRSFeignClient.greeting();
    }

    //spring.application.name=eureka-client-service1 есть в настройках Service1
    @GetMapping("/byRt")
    public String hello1RT() {
        HttpEntity<String> request = new HttpEntity<>("bar");
        return restTemplate.postForObject("http://eureka-client-service1/hello1ForRT", request, String.class);
    }
}
