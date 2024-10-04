package com.arnaud.clairdelune.models;
    
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;
    private String firstname;
    private String lastname;
    private String email;
    private String password;


    // constructeur par défaut
    User() {

    }

    // constructeur appelé si arguments
    User(String a_role, String a_firstname, String a_lastname, String a_email, String a_password) {
        this.role = a_role;
        this.firstname = a_firstname;
        this.lastname = a_lastname;
        this.email = a_email;
        this.password = a_password;
    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }







    // setter

    public void setRole(String a_role) {
        this.role = a_role;
    }

    public void setFirstname(String a_firstname) {
        this.firstname = a_firstname;
    }

    public void setLastname(String a_lastname) {
        this.lastname = a_lastname;
    }

    public void setEmail(String a_email) {
        this.email = a_email;
    }

    public void setPassword(String a_password) {
        this.password = a_password;
    }
}
