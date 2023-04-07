package com.mohand6.newprojectspringboot.home;

import jakarta.xml.ws.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {


    private static List<Services> kk=
        new ArrayList<>(    Arrays.asList(
                    new Services("mohannad",12,303),
                     new Services("khaled",33,566),
                     new Services("jamikl",93,586),
                    new Services("hani",38,556)));





    public static Object getname(int age){

        for(Services ser:kk){

            if(ser.getAge()==age)return ser;
        }
        return null;
    }

    public static List<Services> getall() {
        return kk;
    }
    public static boolean save(Services ser){
return kk.add(ser);

    }

    public static void delet(int id) {

        for(Services ser:kk){
            if(ser.getId()==id){
                kk.remove(ser);
            }


        }
    }
}
