package com.springpractice.springappfirstmedium;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//access the db
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
