package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {

}
