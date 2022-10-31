package com.servicing.serviceofdepartment.Service;

import com.servicing.serviceofdepartment.Entity.DepartmentEntity;
import com.servicing.serviceofdepartment.Repository.RepositoryDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepartment {

    @Autowired
    private RepositoryDepartment repositoryDepartment;

    public DepartmentEntity createDept(DepartmentEntity dept) {
        return repositoryDepartment.save(dept);
    }

    public List<DepartmentEntity> getallDeptDetails() {
        return repositoryDepartment.findAll();
    }

    public DepartmentEntity findBydepartmentId(Long id) {
        return repositoryDepartment.findBydepartmentId(id);
    }
}
