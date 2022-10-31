package com.servicing.serviceofdepartment.Controller;

import com.servicing.serviceofdepartment.Entity.DepartmentEntity;
import com.servicing.serviceofdepartment.Service.ServiceDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Department")
public class ControllerDepartment {

    @Autowired
    private ServiceDepartment serviceDepartment;

    @PostMapping("/CreateDept")
    public DepartmentEntity createDept(@RequestBody DepartmentEntity dept){
        return serviceDepartment.createDept(dept);
    }

    @GetMapping("/GetAllDeptDetails")
    public List<DepartmentEntity> getallDeptDetails(){
        return serviceDepartment.getallDeptDetails();
    }

    @GetMapping("{id}")
    public DepartmentEntity findBydepartmentId(@PathVariable("id") Long id){
        return serviceDepartment.findBydepartmentId(id);
    }

}
