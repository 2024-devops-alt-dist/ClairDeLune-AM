package com.arnaud.clairdelune.models;
    
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "etablissement")
class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String address;
    private String description;
    private String photohotel;

    // constructeur par défaut
    Etablissement() {

    }

    // constructeur appelé si arguments
    Etablissement(String a_name, String a_city, String an_address, String a_description, String a_photohotel) {
        this.name = a_name;
        this.city = a_city;
        this.address = an_address;
        this.description = a_description;
        this.photohotel = a_photohotel;

    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPhotohotel() {
        return this.photohotel;
    }







    // setter
    public void setName(String a_name) {
        this.name = a_name;
    }

    public void setCity(String a_city) {
        this.city = a_city;
    }

    public void setAddress(String an_address) {
        this.address = an_address;
    }

    public void setDescription(String a_description) {
        this.description = a_description;
    }

    public void setPhotohotel(String a_photohotel) {
        this.photohotel = a_photohotel;
    }
}