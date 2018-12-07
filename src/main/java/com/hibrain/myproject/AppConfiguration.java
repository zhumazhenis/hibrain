package com.hibrain.myproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class AppConfiguration {

//  @Bean
//  public JdbcTemplate jdbcTemplate() {
//    String psqlUsername, psqlPassword, psqlUrl;
//    psqlUsername = "tpikqlfwkaxrzt";
//    psqlPassword = "0c3e72324a0a8bb85e1e7f9d677d5eccb9572dcf5e634db55c480422b9c47546";
//    psqlUrl = "jdbc:postgresql://ec2-54-247-101-202.eu-west-1.compute.amazonaws.com:5432/dfgootu0tj4em3?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
//    Connection connection = null;
//    try {
//      connection = DriverManager.getConnection(psqlUrl, psqlUsername, psqlPassword);
//    } catch (SQLException e) {
//      e.printStackTrace();
//      System.out.println("bliaaaaaaa");
//    }
//    return new JdbcTemplate(new SingleConnectionDataSource(connection, false));
//  }
}
