package com.hess.colocount;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;


@Configuration
public class AppConfig extends AbstractMongoConfiguration {

    @Autowired
    Environment env;

    @Override
    public String getDatabaseName() {
        return "colocount";
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb://localhost:27017/colocount"));
    }
}
