package com.example.reactuusing_project_manytoone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
// import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Profile {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private long phone_no;
    private String address;

//    @JsonManagedReference
//     @OneToMany(mappedBy = "profile",cascade=CascadeType.ALL)
//     private List<Login>login;

       @JsonBackReference
       @ManyToOne
       @JoinColumn(name = "login_email")
       private Login login;
}
