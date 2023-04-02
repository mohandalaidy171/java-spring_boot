package com.example.fiveprojectspringboot.home;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class One {
   @GetMapping("area")
    public List<Two> hello(){

    return List.of(new Two(20,30,0),new Two(15,40,0),
            new Two(9,12,0),new Two(4,3,0)


            );}
  @GetMapping("area2")
    public List<Two> hello2(){
        return Arrays.asList(
                new Two(2,3,0),new Two(7,5,0)

        );

       }

    }



