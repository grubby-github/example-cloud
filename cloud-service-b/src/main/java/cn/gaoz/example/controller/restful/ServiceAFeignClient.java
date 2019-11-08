package cn.gaoz.example.controller.restful;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-service-a")
public interface ServiceAFeignClient {
    @GetMapping("/rest/testa")
    String testA(String req);
}
