package com.therich.web.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kh.jin on 2020. 6. 5.
 */
@RestController
public class HomeController {

    @GetMapping("/health-check")
    public String checkHealth() {
        return "I'm running.";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return name + "님 안녕하세요.";
    }

    @GetMapping("/json")
    public List<Map<String, String>> get() {

        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "조수진");
        map1.put("job", "student");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "진기환");
        map2.put("job", "developer");


        list.add(map1);
        list.add(map2);

        return list;
    }
}

