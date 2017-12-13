package com.healthedge.rti;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.healthedge.rti.*")
@EntityScan( basePackages = "com.healthedge.rti.audit.entity" )
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableAutoConfiguration
@SpringBootApplication
public class RTIApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(RTIApp.class);

    public static void main(String[] args) {
        LOGGER.debug("logger is enabled");
        SpringApplication.run(RTIApp.class, args);
    }
}
