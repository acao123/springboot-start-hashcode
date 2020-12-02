package com.rongda.myboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @class: AutoConfigrutionClass.class
 * @description:
 * @author: acao
 * @create: 2020-12-02 16:16
 **/
@Configuration
@EnableConfigurationProperties(AutoConfigurationProperties.class)
@ConditionalOnClass(GetHashCodeClass.class)
public class AutoConfigurationClass {

    private final AutoConfigurationProperties autoConfigurationProperties;

    public AutoConfigurationClass(AutoConfigurationProperties autoConfigurationProperties) {
        this.autoConfigurationProperties = autoConfigurationProperties;
    }

    @ConditionalOnMissingBean
    @Bean
    public GetHashCodeClass getHashCodeClass() {
        return new GetHashCodeClass(autoConfigurationProperties.getValue());
    }
}
