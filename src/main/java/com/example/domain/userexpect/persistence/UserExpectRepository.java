package com.example.domain.userexpect.persistence;

import com.example.domain.userexpect.persistence.model.UserExpect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserExpectRepository extends JpaRepository<UserExpect, Long> {

    @Query("select ue.id from UserExpect ue where ue.user_id = :userId")
    Long findExpectByUserId(Long userId);

}
