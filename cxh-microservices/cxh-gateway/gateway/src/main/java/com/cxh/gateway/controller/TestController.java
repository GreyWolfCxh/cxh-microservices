package com.cxh.gateway.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXihua
 * @description
 * @date 2021/10/21 14:24
 */
@RestController
public class TestController {

    @PostMapping("/api-uaa/oauth/token")
    public String index(){
        return "index";
    }

    @RequestMapping("/user/logins")
    public String logins(){
        return "logins";
    }

   /* @RequestMapping("api-uaa/validata/code/{uuid}")
    public String uuids(@PathVariable("uuid") String uuid){
        return uuid;
    }*/

    public static void main(String[] args) {
    }
}
