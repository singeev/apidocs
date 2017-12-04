package com.singeev.api.apidocs.controllers;

import com.singeev.api.apidocs.entities.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
@Api(description = "System management")
public class AdminController {

    @ApiOperation(value = "Open admin page")
    @RequestMapping(method = RequestMethod.GET, produces = "text/html")
    public String showClaimArchivePage() {
        return "admin";
    }

    @ApiOperation(value = "Retrieve all users list")
    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET, produces = "application/json")
    public Iterable<User> getAgentsList() {
        return new ArrayList<>();
    }

    @ApiOperation(value = "Get user by ID")
    @RequestMapping(value="/getClaim/{id}", method= RequestMethod.GET, produces = "application/json")
    public User getUserByID(@PathVariable Integer id, Model model) {
        return new User();
    }

    @ApiOperation(value = "Show create user page")
    @RequestMapping(value = "/createUser", method = RequestMethod.GET, produces = "application/json")
    public String showCreateUserPage(){
        return "createUser";
    }

    @ApiOperation(value = "Create new user")
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity createNewUser(@RequestBody User user){
        return new ResponseEntity("New user successfully created", HttpStatus.OK);
    }

    @ApiOperation(value = "Update existing user")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity updateUser(@RequestBody User user){
        return new ResponseEntity("User successfully updated", HttpStatus.OK);
    }
}
