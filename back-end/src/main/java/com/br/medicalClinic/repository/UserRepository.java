package com.br.medicalClinic.repository;

import com.br.medicalClinic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(
            value = "SELECT * FROM USER U WHERE U.NAME = :nick and U.PASSWORD = :senha",
            nativeQuery = true)
    Collection<User> findClient(String nick, String senha);
}
