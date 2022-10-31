package com.servicing.serviceofuser.Controller;


import com.servicing.serviceofuser.Entity.UserEntity;
import com.servicing.serviceofuser.RestTemplateConnection.UserAndDepartmentPOJO;
import com.servicing.serviceofuser.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Userservice")
public class ControllerUser {

    @Autowired
    private ServiceUser serviceUser;

    @PostMapping("/EntryUser")
    public UserEntity saveUserdetails(@RequestBody UserEntity userdata){
    return serviceUser.saveUserdetails(userdata);
    }

    @GetMapping("/GetAllUserData")
    public List<UserEntity> getUserDetails(){
        return serviceUser.getUserDetails();
    }

    @GetMapping("{id}")
    public UserAndDepartmentPOJO getUserwithDepartment(@PathVariable("id") Long userId){
        return serviceUser.getUserwithDepartment(userId);
    }


}
