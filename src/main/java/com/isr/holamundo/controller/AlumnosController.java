package com.isr.holamundo.controller;

import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AlumnosController {


    @GetMapping("univer/alumnos")
    public List<String> alumnos(){
       return Arrays.asList("pablo","daniel","laura");
    }

}
