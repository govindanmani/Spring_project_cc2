package com.example.reactuusing_project_manytoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactuusing_project_manytoone.model.Login;
import com.example.reactuusing_project_manytoone.service.LoginService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Login> postMethod(@RequestBody Login login){
      if(loginService.postMethod(login)==true)
      {
        return new ResponseEntity<>(login,HttpStatus.CREATED);
    }

    return new ResponseEntity<>(login,HttpStatus.INTERNAL_SERVER_ERROR);   
    }

    @GetMapping("/login")
    public List <Login> getMethodName() {
        return loginService.getMethod();
    }


    // @GetMapping("/sortBy")
    // public List<Login> MethodName() {
    //     return loginService.getMethodLast();
    // }
    


    // @GetMapping("/product/{offset}/{pagesize}")
    // public List<Login> Pagination(@PathVariable int offset,@PathVariable int pagesize) {
    //     return loginService.Pagination(offset,pagesize);
    // }
    



}
