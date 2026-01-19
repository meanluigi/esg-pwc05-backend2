package com.planto.esgpwc05backend2.controller;

import com.planto.esgpwc05backend2.dao.TestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestMapper mapper;

    public TestController(TestMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/health/db")
    public String dbCheck() {
        return mapper.test();
    }
}
