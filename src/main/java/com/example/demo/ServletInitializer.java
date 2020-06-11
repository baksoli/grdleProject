package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
    Spring Boot로 웹 애플리케이션을 만들고 이를 
    서블릿 컨테이너(Apache Tomcat과 같은) WAR로 배포할 때
    SpringBootServletInitailzer를 상속한다.
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}
