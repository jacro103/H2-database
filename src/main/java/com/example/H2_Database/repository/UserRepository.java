package com.example.H2_Database.repository;

import com.example.H2_Database.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
