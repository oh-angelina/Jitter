package com.ao.Jitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ao.Jitter.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username); 
}
