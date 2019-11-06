package cn.gaoz.example.controller.restful;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/rest")
public class ServiceAController {
    @GetMapping("/testa")
    public String testA(String req) {
        return "req=" + req;
    }
}