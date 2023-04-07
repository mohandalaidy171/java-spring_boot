package com.mohand6.newprojectspringboot.home;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping ("/mohannad/")
public class client {



    @GetMapping("all")
    public List<Services> getser(){

        return Controller.getall();
    }
    @GetMapping("/{age}")
    public Object getid(@PathVariable int age){
        return  Controller.getname(age);

    }

    @PostMapping("ass")
    public Services add(@RequestBody Services ser){
        if(Controller.save(ser)) {
            return ser;
        }return null;
    }
    @DeleteMapping("/{id}")
    public void deletm(@PathVariable int id){

   Controller.delet(id);
    }
}
