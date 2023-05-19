package com.example.domain.user.persistence;


import com.example.domain.user.persistence.model.UsersBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersBase, Long> {

    UsersBase findByPasswordAndEmail(String password, String email);
}
