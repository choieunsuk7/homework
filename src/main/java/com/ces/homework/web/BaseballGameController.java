package com.ces.homework.web;

import com.ces.homework.BaseBallGame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseballGameController {
    @GetMapping("/play")
    public String play(){
        BaseBallGame bg = new BaseBallGame();

        return bg.getScore("123","321");
    }
}
