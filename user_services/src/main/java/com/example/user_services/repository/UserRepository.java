package com.example.user_services.repository;

import com.example.user_services.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT * FROM user where IdUser= ?", nativeQuery = true)
    public User findUserById(int idUser);

}