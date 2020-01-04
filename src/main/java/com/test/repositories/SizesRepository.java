package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Sizes;

@Repository
public interface SizesRepository extends JpaRepository<Sizes, Integer> {

}
