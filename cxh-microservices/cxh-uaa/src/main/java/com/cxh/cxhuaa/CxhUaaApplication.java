package com.cxh.cxhuaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.cxh")
public class CxhUaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxhUaaApplication.class, args);
    }

}
