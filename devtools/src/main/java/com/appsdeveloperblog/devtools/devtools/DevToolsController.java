package com.appsdeveloperblog.devtools.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevToolsController {
    @GetMapping("/devToolsTest")
    public String testAPI() {
        return "DevToolsTest Updated10";
    }
}
