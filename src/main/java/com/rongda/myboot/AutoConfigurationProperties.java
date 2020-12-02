package com.rongda.myboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @class: AutoConfigruationProperties.class
 * @description:
 * @author: acao
 * @create: 2020-12-02 16:03
 **/
@ConfigurationProperties("target.string")
public class AutoConfigurationProperties {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
