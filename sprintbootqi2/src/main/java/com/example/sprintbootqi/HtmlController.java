package com.example.sprintbootqi;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

import java.io.*;
import java.util.*;
import util.wordladdder;

import javax.annotation.PostConstruct;


//@Controller
@Controller
public class HtmlController {
    private final static Map<String, String> userinfo = new HashMap<String, String>();

    @PostConstruct
    public void init(){
        userinfo.put("1","one");
        userinfo.put("2","two");
    }

    /*@RequestMapping(value="/hello",method = RequestMethod.GET)
    public String run() throws IOException {
        return wordladdder.start();
    }*/

    @RequestMapping(value="/login",method=RequestMethod.GET )
    public String login(){
        return "login";
    }


    @RequestMapping(value="/whetherin",method=RequestMethod.GET )
    public String check(@ModelAttribute("username") String username,@ModelAttribute("password") String password){
        return "whin";
    }

    @RequestMapping(value="/user/add",method=RequestMethod.GET)
    public String add(){
        return "user.add";
    }

    @RequestMapping(value="/user/update",method=RequestMethod.GET)
    public String update(){
        return "update";
    }
}