package com.emti.emti_backend.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix("api", clazz -> {
            // springdoc 패키지는 api로 시작하지 않도록 설정
            String packageName = clazz.getPackageName();
            return !packageName.contains("springdoc");
        });
    }

}
