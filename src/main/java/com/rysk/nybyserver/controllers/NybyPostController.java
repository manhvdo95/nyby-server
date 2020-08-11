package com.rysk.nybyserver.controllers;

import com.rysk.nybyserver.model.NybyPost;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/nybyPost")
@AllArgsConstructor
public class NybyPostController {

    @GetMapping("/test")
    public ResponseEntity<String> getHelloWorld() {

        String test1 = "123 - 456";
        String test2 = test1.replace(" ", "").split("-")[0];

        log.info("test2: {}", test2);
        log.info("Thrid COMMMIT: {}");
//
//        NybyPost realNybyPost = NybyPost.builder()
//                .username("REAL USERNAME")
//                .description("REAL DESCRIPTION")
//                .build();
//
//
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//
//        NybyPost test = NybyPost.builder()
//                .username(Optional.ofNullable(realNybyPost.getUsername())
//                        .map(p -> {
//                            stringBuilder.append(" ").append("World");
//                            return p;
//                        })
//                        .orElse("ELSE"))
//                .description(stringBuilder.toString())
//                .build();
//
//
//
//
//        log.info("test1: {}", test);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Hello World");
    }

}
