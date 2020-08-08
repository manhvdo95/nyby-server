package com.rysk.nybyserver.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nybyPost")
@AllArgsConstructor
public class NybyPostController {

    @GetMapping("/test")
    public ResponseEntity<String> getHelloWorld() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Hello World");
    }

}
