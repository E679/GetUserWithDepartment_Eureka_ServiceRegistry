package com.servicing.serviceofdepartment.Repository;

import com.servicing.serviceofdepartment.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDepartment extends JpaRepository<DepartmentEntity, Long> {
    DepartmentEntity findBydepartmentId(Long id);
}
