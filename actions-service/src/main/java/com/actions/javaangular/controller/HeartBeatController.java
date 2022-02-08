package com.actions.javaangular.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/heartbeat")
@Slf4j
public class HeartBeatController {

    @GetMapping(path = "")
    public String heartbeat() {
        return "I am running!!!";
    }
}
