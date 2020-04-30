package com.newroadedu.erp.nwerp.dao;

import com.newroadedu.erp.nwerp.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
