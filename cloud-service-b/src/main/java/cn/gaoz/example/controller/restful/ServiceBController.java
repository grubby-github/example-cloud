package cn.gaoz.example.controller.restful;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/rest")
public class ServiceBController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;

    @GetMapping("/call")
    public String call(String req) {
        String result = serviceAFeignClient.testA(req);
        return "b to a 访问结果 ----- " + result;
    }

    @GetMapping("/callselft")
    @HystrixCommand(fallbackMethod="fallback")
    public String callselft(String req) {
        String result = "访问结果 ----- " + req;
        return result;
    }

    private String fallback(String name) {
        System.out.println(name);
        return "ServiceA繁忙";
    }
}