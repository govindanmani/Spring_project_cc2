package com.example.reactuusing_project_manytoone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.reactuusing_project_manytoone.model.Login;
import com.example.reactuusing_project_manytoone.model.Profile;
import com.example.reactuusing_project_manytoone.repository.ProfileRepo;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepo profileRepo;

    public boolean postMethod(@RequestBody Profile profile)
    {
        try{
            profileRepo.save(profile);
        }
        catch(Exception e)
        {
            return false;

        }
        return true;
    }

    public Optional<Profile> getMethod(String name)
    {
        return profileRepo.findById(name);
    }


    public List<Profile> getMethodLast(String field)
    {
        return profileRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<Profile> Pagination(int offset,int pagesize)
    {
        Page<Profile>p=profileRepo.findAll(PageRequest.of(offset, pagesize));
        return p.getContent();
    }

}
