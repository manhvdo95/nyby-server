package com.rysk.nybyserver.controllers;

import com.rysk.nybyserver.services.INybyPostService;
import com.rysk.nybyserver.models.views.NybyPost;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/nybyPost")
@AllArgsConstructor
public class NybyPostController {

    private INybyPostService nybyPostService;

    @GetMapping("/post/{id}")
    public ResponseEntity<NybyPost> getNybyPostById(@PathVariable Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(nybyPostService.getNybyPostById(id));
    }

    @GetMapping("/post")
    public ResponseEntity<List<NybyPost>> getAllNybyPost() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(nybyPostService.getAllNybyPost());
    }

    @PostMapping("/post")
    public ResponseEntity<NybyPost> addNybyPost(@RequestPart MultipartFile file,
                                                @RequestPart NybyPost nybyPost) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(nybyPostService.addNybyPost(nybyPost, file));
    }

}
