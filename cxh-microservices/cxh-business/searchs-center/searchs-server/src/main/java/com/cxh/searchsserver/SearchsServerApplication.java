package com.cxh.searchsserver;

import com.cxh.searchsserver.admin.properties.IndexProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties(IndexProperties.class)
public class SearchsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchsServerApplication.class, args);
    }

}
