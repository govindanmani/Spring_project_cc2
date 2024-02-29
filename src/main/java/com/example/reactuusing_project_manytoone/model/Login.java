package com.example.reactuusing_project_manytoone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Login {
    @Id
    private String email;
    private String password;
    // @JsonBackReference
    // @ManyToOne
    // @JoinColumn(name="Profile_email")
  
    // private  Profile profile;


    @JsonManagedReference
    @OneToMany(mappedBy = "login",cascade = CascadeType.ALL)
    private List<Profile> profiles;

    
}
