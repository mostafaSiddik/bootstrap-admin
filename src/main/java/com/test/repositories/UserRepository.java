package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u.name FROM users u WHERE u.id = :id")
	public String getUserName(@Param("id") Integer id);

	@Query("SELECT u FROM users u WHERE u.email = :email")
	public User findUserByEmail(@Param("email") String email);

}
