package com.green.boot1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {
    @GetMapping("/hello")
    public void hello(Model model) {

        log.info("hello................");
        model.addAttribute("msg", "HELLO WORLD");
        String[] animal=new String[]{"코끼리","사자","레오파트"};
        model.addAttribute("animals", animal);
    }

    @GetMapping("/helloArray")
    public void helloArray(Model model) {

        log.info("helloArray................");
        String[] animals=new String[]{"코끼리","사자","레오파드", "코뿔소", "하마", "기린"};
        model.addAttribute("animals", animals);
    }

    @GetMapping("/ex/ex3")
    public void ex3(Model model) {

        model.addAttribute("arrs", new String[]{"AAA","BBB","CCC"});

    }



}