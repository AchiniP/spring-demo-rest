//package com.conference.conferencedemo.config;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//
//@Configuration
//public class PersistenceConfiguration {
//    // to overide spring boot properties with java config
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:mysql://localhost:3306/conference_demo");
//        System.out.println("My custom datasource is Initialized and set");
//        return builder.build();
//    }
//}
