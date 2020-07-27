package br.com.docker.training.dockerdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping( path = "/info")
    public String getInfo(){
        return System.getenv("VERSION_APP");
    }
}
