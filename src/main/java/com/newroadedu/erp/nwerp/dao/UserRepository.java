package com.newroadedu.erp.nwerp.dao;

import com.newroadedu.erp.nwerp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
