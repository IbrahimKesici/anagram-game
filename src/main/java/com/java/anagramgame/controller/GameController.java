package com.java.anagramgame.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class GameController {

    @PostMapping("/guess")
    public String guess(@RequestBody String word){
        return word;
    }
}
