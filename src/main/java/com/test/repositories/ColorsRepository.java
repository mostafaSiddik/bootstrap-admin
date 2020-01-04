package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Colors;

@Repository
public interface ColorsRepository extends JpaRepository<Colors, Integer> {

}
