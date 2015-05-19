package com.houssam.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.houssam.modele.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>, CrudRepository<Person, Long>{

	List<Person> findByNom(String nom);
}
