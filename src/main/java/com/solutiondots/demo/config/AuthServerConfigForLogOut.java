package com.solutiondots.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class AuthServerConfigForLogOut extends WebSecurityConfigurerAdapter {


    protected void configurer(HttpSecurity httpSecurity)throws Exception{

        httpSecurity.logout().logoutSuccessUrl("http://your-auth-server/exit");


    }
}
