package com.example.demo.board.board.controller;

import com.example.demo.properties.RandomValuePropertySource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloRestController {
    private final RandomValuePropertySource randomValuePropertySource;

    //@GetMapping
    @RequestMapping("/")
    public String learning(){
        String uuid = randomValuePropertySource.getUuid();
        String bigNumber = randomValuePropertySource.getBignumber();
        String secret = randomValuePropertySource.getSecret();
        
        return "Hello !! 반갑습니다 uuid :: "+uuid+"!!!! "+secret + ", bigNumber :: "+bigNumber;
    }
}
