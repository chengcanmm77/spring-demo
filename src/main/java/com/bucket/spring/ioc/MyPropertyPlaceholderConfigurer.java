package com.bucket.spring.ioc;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess,
                                     Properties props) throws BeansException {
        // TODO Auto-generated method stub
        super.processProperties(beanFactoryToProcess, props);
    }

}
