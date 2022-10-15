package com.example.demo.controller;

import com.example.demo.service.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stats")
@RequiredArgsConstructor
public class StatController {

    private final StatsService statsService;

    @PutMapping(value = "/save")
    public ResponseEntity saveStats() {
        statsService.saveStats();
        return ResponseEntity.ok().build();
    }
}
