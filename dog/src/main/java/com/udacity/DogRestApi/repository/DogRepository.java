package com.udacity.DogRestApi.repository;

import com.udacity.DogRestApi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("SELECT d.Id, d.Breed FROM Dog d")
    List<String> findAllBreed();

    @Query("SELECT d.Id, d.Breed FROM Dog d WHERE d.Id=:Id")
    String findBreedById(Long Id);

    @Query("SELECT d.Id, d.Name FROM Dog d")
    List<String> findAllName();
}
