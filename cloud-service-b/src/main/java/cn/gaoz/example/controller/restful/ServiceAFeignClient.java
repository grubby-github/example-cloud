package cn.gaoz.example.controller.restful;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cloud-service-a")
public interface ServiceAFeignClient {
    @GetMapping("/rest/testa")
    String testA(@RequestParam String req);
}
