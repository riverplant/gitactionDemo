package com.jie.gitaction.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gitaction")
public class TestController {

    @GetMapping(value = "/showMessage")
    public ResponseEntity<String>  showMessage() {

        return ResponseEntity.ok("bonjour");
    }
}
