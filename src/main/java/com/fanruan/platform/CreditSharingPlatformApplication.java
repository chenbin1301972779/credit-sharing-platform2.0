package com.fanruan.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.fanruan.*")
public class CreditSharingPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditSharingPlatformApplication.class, args);
    }

}
