package com.app.rc.gswspringbootmicroservice.app.ws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.rc.gswspringbootmicroservice.app.ws.io.entity.UsersEntity;

@Repository
public interface UsersRepository
        extends
            CrudRepository< UsersEntity, Long > {

    public UsersEntity getUsersById (
            int id );

}
