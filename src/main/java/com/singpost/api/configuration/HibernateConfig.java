package com.singpost.api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class HibernateConfig
{
    @Autowired
    private DatabaseProperties databaseProperties;

    @Bean
    public DataSource dataSource()
    {
        System.out.println(databaseProperties.getDataUsername());
        System.out.println(databaseProperties.getDataPassword());
        System.out.println(databaseProperties.getUrl());
        System.out.println(databaseProperties.getDriverClassName());
        System.out.println(databaseProperties.getDatabasePlatform());
        System.out.println(databaseProperties.getDdlAuto());
        return DataSourceBuilder.create().build();
    }
}