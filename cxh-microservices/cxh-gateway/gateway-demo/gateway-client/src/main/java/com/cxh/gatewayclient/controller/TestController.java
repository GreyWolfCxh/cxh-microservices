package com.cxh.gatewayclient.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ChenXihua
 * @description
 * @date 2021/10/22 11:33
 */
@RestController
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "gateway-client";
    }

}
