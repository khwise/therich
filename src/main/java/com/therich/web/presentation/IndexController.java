package com.therich.web.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kh.jin on 2020. 6. 5.
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping(value = "/a")
    @ResponseBody
    public String a() {
        return "index";
    }
}
