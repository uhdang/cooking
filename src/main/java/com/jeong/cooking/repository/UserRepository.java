package com.jeong.cooking.repository;

import com.jeong.cooking.api.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
