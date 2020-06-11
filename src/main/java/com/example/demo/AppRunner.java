package com.example.demo;

import com.example.demo.controller.HelloRestController;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class AppRunner implements ApplicationRunner {

    /*
        AppRunner는 ApplicationRunner 인터페이스를 구현,
        Bean으로 등록되어 있으면 서버 구동시 AppRunner 구현체가 실행
        따라서 run 메서드에 있는 코드가 먼저 실행된다.
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
