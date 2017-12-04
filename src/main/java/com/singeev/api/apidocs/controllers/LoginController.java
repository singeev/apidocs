package com.singeev.api.apidocs.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@Api(description = "Security stuff")
public class LoginController {

    @ApiOperation(value = "Show login page")
    @RequestMapping(method = RequestMethod.GET, produces = "text/html")
    public String showLoginPage(){
        return "login";
    }
}
