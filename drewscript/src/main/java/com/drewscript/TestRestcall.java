package com.drewscript;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestcall {

    @RequestMapping("api")
    public String hello() {
        return "hello mejet";
    }
}
