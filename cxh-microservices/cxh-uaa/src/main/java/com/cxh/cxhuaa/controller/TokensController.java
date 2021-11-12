package com.cxh.cxhuaa.controller;

import com.cxh.cxhcommoncore.model.Result;
import com.cxh.cxhuaa.entity.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author ChenXihua
 * @description
 * @date 2021/11/4 17:38
 */
@Controller
public class TokensController {

    @PostMapping("/oauth/token")
    @ResponseBody
    public Result<String> rs (Login login){
        Result<String> result = new Result();
        result.setDatas("123");
        result.setResp_code(0);
        return result;
    }

    @GetMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
