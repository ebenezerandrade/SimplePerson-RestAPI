package br.com.ebenezer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ebenezer.models.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{

}
