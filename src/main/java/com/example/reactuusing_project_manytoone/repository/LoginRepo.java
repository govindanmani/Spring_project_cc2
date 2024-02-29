package com.example.reactuusing_project_manytoone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.reactuusing_project_manytoone.model.Login;
@Repository
public interface LoginRepo extends JpaRepository<Login,String> {
    // @Query("select p from Login p order by age")
    // List<Login> findByEmail();

} 