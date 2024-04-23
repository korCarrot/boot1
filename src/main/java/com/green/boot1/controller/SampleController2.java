package com.green.boot1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@Log4j2
public class SampleController2 {


    @GetMapping("/ex/ex2")
    public void ex2(Model model){
        log.info("ex2");
       List<String> strList=IntStream.range(1,10).mapToObj((i)->{return "Date"+i;}).collect(Collectors.toList());
        model.addAttribute("list", strList);


        Set<String> set=new HashSet<>();
        set.add("aaa");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

        model.addAttribute("set", set);


        Map<String, String> map=new HashMap<>();

        map.put("a","apple");
        map.put("b","banana");

        model.addAttribute("map", map);


        SampleDTO sampleDTO =new SampleDTO("hh", "ii", "jj");
        Map<String, SampleDTO> map2=new HashMap<>();

        map2.put("sampleDTO", sampleDTO);
        model.addAttribute("map2", map2);
    }



    // inner class
    class SampleDTO{
        private String s1,s2,s3;

        public SampleDTO(String s1, String s2, String s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        public String getS1() {
            return s1;
        }

        public String getS2() {
            return s2;
        }

        public String getS3() {
            return s3;
        }
    }
}
