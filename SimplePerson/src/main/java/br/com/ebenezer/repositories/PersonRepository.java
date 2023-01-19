package br.com.ebenezer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ebenezer.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
