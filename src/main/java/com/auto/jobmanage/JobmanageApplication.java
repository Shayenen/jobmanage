package com.auto.jobmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
@MapperScan("com.auto.jobmanage.job.dao")
public class JobmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobmanageApplication.class, args);
    }

}
