package com.singpost.api.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datasource")
public class DatabaseProperties
{
        @Getter
        @Setter
        private String url;

        @Getter
        @Setter
        private String driverClassName;

        @Getter
        @Setter
        private String dataUsername;

        @Getter
        @Setter
        private String dataPassword;

        @Getter
        @Setter
        private String databasePlatform;

        @Getter
        @Setter
        private String ddlAuto;
}
