package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();           // can be invoked by findAll() method in DogRepository
    List<String> retrieveDogBreed();    // data type matches JPA query findAllBreed in DogRepository
    String retrieveDogBreedById(Long Id);      // data type matches JPA query findBreedById in DogRepository
    List<String> retrieveDogNames();    // data type matches JPA query findAllName in DogRepository
}
