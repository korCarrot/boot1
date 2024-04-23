package com.green.boot1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Log4j2
public class SampleJSONController {

    @GetMapping("/helloArr")
    public String[] helloArr(Model model){

        log.info("helloArr..................");
        String[] strArr=new String[]{"AAA","BBB","CCC"};

        return strArr;
    }

    @GetMapping("/helloList")
    public List<String> helloList(){

        log.info("helloList..................");
        List<String> list=Arrays.asList("AAA#","BBB#","CCC#");
        return list;

    }



}
