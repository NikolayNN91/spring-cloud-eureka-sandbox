package eureka.client.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RController {

    @Autowired(required = false)
    public RestTemplate restTemplate;

    @Autowired
    public FeignController feignController;

    @GetMapping
    public String hello1() {
        return "Not registered service";
    }

    @GetMapping("/feign")
    public String hello2() {
        return feignController.greeting();
    }
}
