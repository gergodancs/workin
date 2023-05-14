package com.example.domain.user.persistence;


import com.example.domain.user.persistence.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {


    @Query("select u from UserData u where u.user.id = :userId")
    UserData findByUserId(Long userId);
}
