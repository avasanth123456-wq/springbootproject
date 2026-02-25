package com.vasanth.project.repository;

import com.vasanth.project.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NameRepository extends JpaRepository<Name, Long> {

//   @Query("SELECT p FROM Person p WHERE LENGTH(p.name) >= :length")
//    List<Name> findNameByMinLength(int minlength);


}

