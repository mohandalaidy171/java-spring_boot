package com.example.projectfourspringboot.home;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("mohand/v1/")
public class oneclass {

    ;
    @GetMapping("/")
    public info getinfo() {
info in1=new info(201910112,"mohand alaidy",27);


return in1;

    }

    @GetMapping("/2")
    public String get2(){
        String name="jamil";
        return  String.format("me name is %S ", name);
    }

   @GetMapping("/3")
    public List<String> get3(){

        return List.of("java","c++","php");
    }
}
