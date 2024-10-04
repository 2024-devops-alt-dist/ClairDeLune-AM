package com.arnaud.clairdelune.models;
    
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "suite")
class Suite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String prix;
    private String photosuite;

    // constructeur par défaut
    Suite() {

    }

    // constructeur appelé si arguments
    Suite(String a_titre, String a_description, String a_prix, String a_photosuite) {
        this.titre = a_titre;
        this.description = a_description;
        this.prix = a_prix;
        this.photosuite = a_photosuite;

    }

    // getter
    public Long getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPrix() {
        return this.prix;
    }
    public String getPhotohotel() {
        return this.photosuite;
    }







    // setter
    public void setName(String a_titre) {
        this.titre = a_titre;
    }

    public void setCity(String a_description) {
        this.description = a_description;
    }

    public void setAddress(String a_prix) {
        this.prix = a_prix;
    }
    public void setDescription(String a_photosuite) {
        this.photosuite = a_photosuite;
    }
}