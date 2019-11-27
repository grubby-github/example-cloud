package cn.gaoz.example.controller.restful;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/rest")
public class ServiceAController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/testa")
    @HystrixCommand(fallbackMethod="fallback")
    public String testA(String req) {
        return "req=" + req + ", port=" + port;
    }

    private String fallback(String name) {
        System.out.println(name);
        return "ServiceA繁忙";
    }
}