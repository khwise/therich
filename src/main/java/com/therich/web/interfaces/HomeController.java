package com.therich.web.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kh.jin on 2020. 6. 5.
 */
@RestController
public class HomeController {
    @GetMapping("/health-check")
    public String checkHealth() {
        return "I'm running.";
    }
}