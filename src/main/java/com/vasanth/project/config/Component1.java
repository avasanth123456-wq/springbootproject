package com.vasanth.project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Component1 {

    @Autowired
    String vasanth;

    @Autowired
    Rijju rijju;

    public void checking(){
        System.out.println(vasanth);
    }

}
