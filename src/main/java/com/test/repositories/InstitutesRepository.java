package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Institutes;

@Repository
public interface InstitutesRepository extends JpaRepository<Institutes, Integer> {

}
