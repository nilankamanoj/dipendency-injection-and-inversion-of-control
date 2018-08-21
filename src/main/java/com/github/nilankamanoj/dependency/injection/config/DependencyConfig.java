package com.github.nilankamanoj.dependency.injection.config;

import com.github.nilankamanoj.dependency.injection.ioc.dependency.DependencyOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyConfig {
    @Bean
    public DependencyOne dependencyOne(){

        DependencyOne dependencyOne = new DependencyOne();
        //complex logic of setting up DependencyOne object.
        return dependencyOne;
    }

    //other bean declarations for dependencies---->
}
