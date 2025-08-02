package com.ajsh.ashb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:application-dev.properties")
})
public class MyFirstService {

    private final MyFirstClass myFirstClass;

    @Value("${my.var}")
    private String customVar;

    @Value("${my.dev.custom.property}")
    private String customVarDev;

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String getString() {
        return "The dependency is saying : " + myFirstClass.sayHey() ;
    }

    public String getCustomVar() {
        return customVar;
    }

    public String getCustomVarDev() {
        return customVarDev;
    }

}
