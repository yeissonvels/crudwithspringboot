package com.yeisson.crudwithspringboot.repositories;

import com.yeisson.crudwithspringboot.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
