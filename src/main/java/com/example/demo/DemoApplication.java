package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  프로젝트 동작할 수 있게 해주는 파일
// @SpringBootApplication = @ComponentScan + @Configuration + @EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

    /*
        main() 함수가 SpringContext를 실행하며 Application을 구동
        첫번째 인자는 주요 Spring component 전달
        두번째 인자는 command-line 인자들을 전달
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
