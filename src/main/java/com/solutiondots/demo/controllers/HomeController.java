package com.solutiondots.demo.controllers;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Arif Heer on 04/09/2018
 *
 * here i am performing  four major steps for Oauth 2 configuration
 * 1) Setting up Authorization server
 * 2) Setting up Resource Server
 * 3) Setting up Authentication Manager
 * 4) Setting up a customUserDetailService
 */
@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "Private area";
    }

    @RequestMapping("/exit")
    public void exit(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {

            response.sendRedirect(request.getHeader("referer"));
    }catch(IOException e){
            e.printStackTrace();
        }


    }

}
