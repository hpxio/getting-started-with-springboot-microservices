package com.app.rc.gettingStartedWithSpringBootMicroservice.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.rc.gettingStartedWithSpringBootMicroservice.data.entity.UsersEntity;

/**
 *
 */
@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, Long> {
    public UsersEntity getUsersById(int id);
}
