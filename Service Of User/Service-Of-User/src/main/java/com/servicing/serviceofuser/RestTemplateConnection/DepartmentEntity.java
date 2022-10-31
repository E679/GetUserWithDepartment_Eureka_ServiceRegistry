package com.servicing.serviceofuser.RestTemplateConnection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentEntity {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
