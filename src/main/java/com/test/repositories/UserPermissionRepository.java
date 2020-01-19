package com.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.models.UserPermission;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Integer> {

}
