package com.adc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2019-01-04
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_App7001 {
    public static void main(String args[]){
        SpringApplication.run(EurekaServer_App7001.class,args);
    }
}
