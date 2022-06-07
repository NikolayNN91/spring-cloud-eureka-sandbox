package eureka.client.com.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

@RestController
public class Service1Controller {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private ServletWebServerApplicationContext webServerAppCtxt;

    @GetMapping("/hello1")
    public String hello1() throws InterruptedException {
        Thread.sleep(1000);
        return "Some bullshit " + eurekaClient.getApplication(appName).toString() + " port=" + webServerAppCtxt.getWebServer().getPort();
    }

    @PostMapping(value = "/hello1ForRT", consumes = MediaType.TEXT_PLAIN, produces = MediaType.TEXT_PLAIN)
    public @ResponseBody
    String hello1RT(@RequestBody String str, HttpServletRequest request) {
        return "Some bullshit for RT client=" + request.getRemotePort() + " port=" + webServerAppCtxt.getWebServer().getPort();
    }
}
