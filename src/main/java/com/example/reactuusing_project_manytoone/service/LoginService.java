package com.example.reactuusing_project_manytoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.reactuusing_project_manytoone.model.Login;
import com.example.reactuusing_project_manytoone.model.Profile;
import com.example.reactuusing_project_manytoone.repository.LoginRepo;

@Service
public class LoginService {

    @Autowired
    private LoginRepo loginRepo;


      public boolean postMethod(@RequestBody Login login)
       {
        try
        {
            loginRepo.save(login);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public List<Login> getMethod()
    {
        return loginRepo.findAll();
    }



    // public List<Login> getMethodLast()
    // {
    //     return loginRepo.findByEmail();
    // }

   
    
    


}
