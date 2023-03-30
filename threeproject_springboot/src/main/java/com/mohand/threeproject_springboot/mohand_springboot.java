package com.mohand.threeproject_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/mohand-info")
public class mohand_springboot {

   @GetMapping
    public List<String> hello(){


        return List.of(
                "Name :mohand alaidy",
                "university: Amman Arab University",
                "Age :27 Years old",
                "Speslization :Software Enginnering"
        );
    }
}
