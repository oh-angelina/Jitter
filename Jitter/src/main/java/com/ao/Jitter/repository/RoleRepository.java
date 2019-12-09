package com.ao.Jitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ao.Jitter.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

		Role findByRole(String role); 
}
