package com.example.dockerimage.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author rfaita
 */
@Configuration
@Profile({"default", "docker-compose"})
@EnableMongoRepositories("com.example.dockerimage.repository")
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${mongodb.hostname}")
    private String mongoHost;

    @Value("${mongodb.port}")
    private String mongoPort;

    @Value("${mongodb.database}")
    private String mongoDB;

    @Override
    @Bean
    public MongoClient mongoClient() {

        return new MongoClient(mongoHost + ":" + mongoPort);
    }

    @Override
    protected String getDatabaseName() {

        return mongoDB;
    }

    @Override
    protected String getMappingBasePackage() {

        return "com.example.dockerimage.model";
    }
}