package com.learn._04_advanced._07_profile.module.selector;

import com.learn._04_advanced._07_profile.bean.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类中 bean 会被 BarImportSelector 导入 IOC 容器中
 */
@Configuration
public class BarConfiguration {
    @Bean
    public Bar BBbar(){
        return new Bar();
    }
}
