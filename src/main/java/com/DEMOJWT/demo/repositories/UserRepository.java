package com.DEMOJWT.demo.repositories;

import com.DEMOJWT.demo.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface UserRepository  extends MongoRepository<UserModel,String> {
    UserModel findByUser(String user);
}
