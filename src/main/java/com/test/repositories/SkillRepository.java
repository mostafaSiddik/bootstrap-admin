package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
