package com.udacity.DogRestApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String Name;
    private String Breed;
    private String Origin;

    public Dog(Long Id, String Name, String Breed, String Origin) {
        this.Id = Id;
        this.Name = Name;
        this.Breed = Breed;
        this.Origin = Origin;
    }

    public Dog(String Name, String Breed) {
        this.Name = Name;
        this.Breed = Breed;
    }

    // no-args constructor required for findAll method in Repository class
    public Dog() {

    }



    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }
}
