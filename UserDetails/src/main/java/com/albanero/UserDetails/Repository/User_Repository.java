package com.albanero.UserDetails.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.albanero.UserDetails.model.User;

@Repository
public interface User_Repository extends MongoRepository<User, Integer> {

	List<User> findUserByUsername(String username);

}
