package com.learnDependencyInjection.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DIConfiguration {
    @Bean
    public Person person(){
        return new Person("Utkarsh",23);
    }


    @Bean
    @Primary
    public Person person2(){
        return new Person("Aniraj",23);
    }
}
