package com.hess.colocount.repository;

import com.hess.colocount.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
    List<User> findByFirstName(String firstName);

}
