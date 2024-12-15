package com.lagikoi.be.repository;

import com.lagikoi.be.entity.UserRole;
import com.lagikoi.be.entity.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {
    @Query("SELECT ur.roleName.name FROM UserRole ur WHERE ur.id.userId = :userId")
    List<String> findRoleNamesByUserId(@Param("userId") String userId);
}