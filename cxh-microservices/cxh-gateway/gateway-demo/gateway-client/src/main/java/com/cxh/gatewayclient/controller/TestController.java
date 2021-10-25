package com.cxh.gatewayclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXihua
 * @description
 * @date 2021/10/22 11:33
 */
@RestController
@RequestMapping("/testGrateway")
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "gateway-service";
    }
}
