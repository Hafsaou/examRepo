package com.example.prototype.repository;

import com.example.prototype.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

      <Optionel> UserModel findByUsername(String username);
}
