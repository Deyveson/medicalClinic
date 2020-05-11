package com.br.medicalClinic.repository;

import com.br.medicalClinic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from clinica.user u where u.name = ?1 and u.password = ?2",
            nativeQuery = true)
    Object[] findClient(String nick, String senha);
}
