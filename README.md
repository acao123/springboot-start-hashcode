# springboot-start-hashcode 自定义springboot starter

- @Configuration：表明此类是一个配置类，将变为一个bean被spring进行管理。
- @EnableConfigurationProperties：启用属性配置，将读取HelloServiceProperties里面的属性。
- @ConditionalOnClass：当类路径下面有HelloServiceConfiguration此类时，自动配置。
- @ConditionalOnProperty：判断指定的属性是否具备指定的值。
- @ConditionalOnMissingBean：当容器中没有指定bean是，创建此bean。
