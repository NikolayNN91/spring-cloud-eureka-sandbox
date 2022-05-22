package eureka.test.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController2 {

    @GetMapping
    public String hello2() {
        return "Something interesting";
    }
}
