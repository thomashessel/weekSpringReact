package com.weekspring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.weekspring.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
