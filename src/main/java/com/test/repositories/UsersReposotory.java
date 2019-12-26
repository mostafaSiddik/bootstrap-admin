package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.User;

@Repository
public interface UsersReposotory extends JpaRepository<User, Integer> {
	
	@Query("SELECT u FROM users u WHERE u.email = :email")
	public User findByEmail(@Param("email") String email);
}
