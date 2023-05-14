package com.example.domain.user.persistence;


import com.example.domain.user.persistence.model.UserBase;
import com.example.domain.userexpect.persistence.model.UserExpect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBase, Long> {

}
