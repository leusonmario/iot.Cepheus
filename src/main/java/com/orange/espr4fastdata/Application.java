package com.orange.espr4fastdata;

import com.orange.espr4fastdata.cep.EsperEventProcessor;
import com.orange.espr4fastdata.cep.ComplexEventProcessor;
import com.orange.espr4fastdata.exception.ConfigurationException;
import com.orange.espr4fastdata.exception.PersistenceException;
import com.orange.espr4fastdata.model.cep.Configuration;
import com.orange.espr4fastdata.persistence.JsonPersistence;
import com.orange.espr4fastdata.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*@Bean
    public ComplexEventProcessor getComplexEventProcessor() throws ConfigurationException, PersistenceException {
        ComplexEventProcessor complexEventProcessor = new EsperEventProcessor();

        if (persistence.checkConfigurationDirectory()) {
            Configuration configuration = persistence.loadConfiguration();

            complexEventProcessor.setConfiguration(configuration);

        }
        return complexEventProcessor;
    }*/



    @Autowired
    public ComplexEventProcessor complexEventProcessor;

    @Autowired
    public Persistence persistence;

    @Autowired
    public Init initEspr4fastdata;


}
