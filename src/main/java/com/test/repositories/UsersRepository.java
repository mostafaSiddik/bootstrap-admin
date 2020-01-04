package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
