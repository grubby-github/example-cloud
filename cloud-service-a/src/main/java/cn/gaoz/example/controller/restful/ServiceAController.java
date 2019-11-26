package cn.gaoz.example.controller.restful;

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
    //@HystrixCommand(fallbackMethod="getFallback")
    public String testA(String req) {
        return "req=" + req + ", port=" + port;
    }

//    protected String getFallback(Throwable e) {
//        System.out.println(e.getMessage());
//        e.printStackTrace();
//        return "ServiceA繁忙";
//    }
}