package me.samadali.template.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping(value = "/test", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
