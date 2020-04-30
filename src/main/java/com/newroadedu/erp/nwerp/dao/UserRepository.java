package com.newroadedu.erp.nwerp.dao;

import com.newroadedu.erp.nwerp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameLike(String name);
    List<User> getAllByCreateDate(Date createDate);
}
