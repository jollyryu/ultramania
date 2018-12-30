package com.ryu.ultramania.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

import static java.lang.Boolean.TRUE;


@Configuration
@EnableTransactionManagement
@PropertySource("application.properties")
public class MariaDBConnectionConfig implements TransactionManagementConfigurer {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String  dbPassword;

    @Value("${spring.datasource.classname}")
    private String dbClassName;


    @Lazy
    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        final HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setUsername(dbUsername);
        hikariConfig.setPassword(dbPassword);

        hikariConfig.addDataSourceProperty("url", dbUrl);
//        hikariConfig.addDataSourceProperty("database_name", "jpub");
//        hikariConfig.addDataSourceProperty("databaseName", "jpub");
        hikariConfig.setDataSourceClassName(dbClassName);
        hikariConfig.setLeakDetectionThreshold(2000);
        hikariConfig.setPoolName("jpubDBpool");
        hikariConfig.setAutoCommit(TRUE);

//        System.out.println("dbUsername " + dbUsername);
//        System.out.println("dbPassword " + dbPassword);
//        System.out.println("dbUrl " + dbUrl);
//        System.out.println("dbClassName " + dbClassName);

        final HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;

    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager(){
        return transactionManager();
    }
}