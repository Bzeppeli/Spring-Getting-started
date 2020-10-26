package com.pluralsight.get_started_with_spring_plural.controller;

import com.pluralsight.get_started_with_spring_plural.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @ResponseBody
    @GetMapping("/message")
    Message send(){
        return new Message("Valeu");
    }

    @PostMapping("/message")
    Message echo (@RequestBody Message message){
        return message;
    };
}
