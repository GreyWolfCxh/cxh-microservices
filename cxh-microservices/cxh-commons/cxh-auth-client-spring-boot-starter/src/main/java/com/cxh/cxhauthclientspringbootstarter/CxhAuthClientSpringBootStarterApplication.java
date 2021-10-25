package com.cxh.cxhauthclientspringbootstarter;

import com.cxh.cxhauthclientspringbootstarter.properties.SecurityProperties;
import com.cxh.cxhauthclientspringbootstarter.properties.TokenStoreProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties({SecurityProperties.class, TokenStoreProperties.class})
@ComponentScan
public class CxhAuthClientSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxhAuthClientSpringBootStarterApplication.class, args);
    }

}
