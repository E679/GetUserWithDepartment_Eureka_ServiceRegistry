package com.servicing.serviceofuser.RestTemplateConnection;


import com.servicing.serviceofuser.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAndDepartmentPOJO {
  private UserEntity userEntity;
  private DepartmentEntity departmentEntity;
}
