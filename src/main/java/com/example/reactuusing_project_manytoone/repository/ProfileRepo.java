package com.example.reactuusing_project_manytoone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.reactuusing_project_manytoone.model.Profile;
@Repository
public interface ProfileRepo extends JpaRepository<Profile,String> {

    //  @Query("select p from Profile p ORDER BY p.age")
    // List<Profile> findByEmail();
    
}
