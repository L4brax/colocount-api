package com.hess.colocount;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByEmail(String email);
    public List<User> findByFirstName(String firstName);

}
