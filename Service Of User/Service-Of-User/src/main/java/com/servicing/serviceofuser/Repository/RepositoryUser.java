package com.servicing.serviceofuser.Repository;

import com.servicing.serviceofuser.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<UserEntity,Long> {
}
