package com.basic.twoprojectspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mohand_spring {

    @GetMapping(value = "/")
    public List<String> print(){
System.out.print( "language programming most");
     return   List.of("java","c++","paython","asp.net");
    }
}
