package com.example.reactuusing_project_manytoone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactuusing_project_manytoone.model.Login;
import com.example.reactuusing_project_manytoone.model.Profile;
import com.example.reactuusing_project_manytoone.service.ProfileService;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

     @PostMapping("/profile")
    public ResponseEntity<Profile> postMethod(@RequestBody Profile profile){
      if(profileService.postMethod(profile)==true)
      {
        return new ResponseEntity<>(profile,HttpStatus.CREATED);
    }

    return new ResponseEntity<>(profile,HttpStatus.INTERNAL_SERVER_ERROR);   
    }

    @GetMapping("/profile")
    public Optional<Profile> getMethodName(@RequestParam String name) {
        return profileService.getMethod(name);
    }

    @GetMapping("/sortBy/{field}")
    public List<Profile> GetMethod(@PathVariable String field)
    {
        return profileService.getMethodLast(field);
    }


    @GetMapping("/product/{offset}/{pagesize}")
    public List<Profile> Pagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) {
        return profileService.Pagination(offset,pagesize);
    }



    // public List<Profile> SortMethod()

}
