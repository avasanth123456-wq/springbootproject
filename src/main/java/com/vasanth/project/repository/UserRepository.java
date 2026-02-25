package com.vasanth.project.repository;

import com.vasanth.project.entity.Name;
import com.vasanth.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE LENGTH(name) > :len", nativeQuery = true)
    List<User> findNamesWithLengthGreaterThanFiveNative(@Param("len") int len);
}
