package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.UserPermissions;

@Repository
public interface UserPermissionsRepository extends JpaRepository<UserPermissions, Integer> {

}
