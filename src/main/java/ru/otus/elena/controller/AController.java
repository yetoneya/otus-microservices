package ru.otus.elena.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping("/health")
    public ResponseEntity<String> getString() {
        return new ResponseEntity<>("{\"Status\": \"OK\"}", HttpStatus.OK);
    }

    @GetMapping("/")
    public HttpStatus getStatus() {
        return HttpStatus.OK;
    }

}
