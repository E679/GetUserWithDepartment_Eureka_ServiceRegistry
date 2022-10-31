package com.servicing.serviceofuser.Service;

import com.servicing.serviceofuser.Entity.UserEntity;
import com.servicing.serviceofuser.Repository.RepositoryUser;
import com.servicing.serviceofuser.RestTemplateConnection.DepartmentEntity;
import com.servicing.serviceofuser.RestTemplateConnection.UserAndDepartmentPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServiceUser {

    @Autowired
    private RepositoryUser repositoryUser;

    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUserdetails(UserEntity userdata) {
        return repositoryUser.save(userdata);
    }


    public List<UserEntity> getUserDetails() {
        return repositoryUser.findAll();
    }


    public UserAndDepartmentPOJO getUserwithDepartment(Long userId) {
        UserAndDepartmentPOJO obj=new UserAndDepartmentPOJO();
        UserEntity user=repositoryUser.findById(userId).get();

        DepartmentEntity dep=
                        restTemplate.getForObject("http://localhost:7003/Department/" +user.getDepartmentId()
                                ,DepartmentEntity.class);
        obj.setUserEntity(user);
        obj.setDepartmentEntity(dep);
        return obj;
    }
}
