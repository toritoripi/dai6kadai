package com.example.FirstSBHelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        String message = "hello world!";
        return  message;
    }

    @GetMapping("/time")
    public Map<String, String> time() {
        Map<String, String> replyMap = new HashMap<String, String>();
        replyMap.put("Greeting", "hello world!");

        String formatNowDate = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日").format(LocalDateTime.now());

        replyMap.put("time", formatNowDate);
        return replyMap;
    }

}
