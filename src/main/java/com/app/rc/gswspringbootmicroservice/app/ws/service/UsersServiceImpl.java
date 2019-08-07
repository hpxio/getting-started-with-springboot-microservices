package com.app.rc.gswspringbootmicroservice.app.ws.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.rc.gswspringbootmicroservice.app.ws.exceptionHandlers.UserNotFoundException;
import com.app.rc.gswspringbootmicroservice.app.ws.io.entity.UsersEntity;
import com.app.rc.gswspringbootmicroservice.app.ws.repository.UsersRepository;
import com.app.rc.gswspringbootmicroservice.app.ws.shared.dto.UsersDTO;
import com.app.rc.gswspringbootmicroservice.app.ws.shared.utils.RandomPlainTextKeyGenerator;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository repository;

    @Override
    public UsersDTO getUserById (
            int id )
    {
        UsersDTO response = new UsersDTO ( );

        UsersEntity entity = repository.getUsersById (
                id );

        // FIXME: Provide exception handling here //
        if ( entity == null ) {
            throw new UserNotFoundException (
                    "User for ID: " + id
                            + " does not exist!" );
        }

        BeanUtils.copyProperties (
                entity,
                response );
        return response;
    }

    /**
     * 
     */
    @Override
    public UsersDTO createUser (
            UsersDTO usersDto )
    {
        UsersDTO response = new UsersDTO ( );
        UsersEntity entity = new UsersEntity ( );

        BeanUtils.copyProperties (
                usersDto,
                entity );

        entity.setAccessKey (
                RandomPlainTextKeyGenerator.getString ( ) );

        entity.setStatus (
                true );

        UsersEntity result = repository.save (
                entity );

        BeanUtils.copyProperties (
                result,
                response );

        return response;
    }

    /**
     * 
     */
    @Override
    public int deleteUser (
            long id )
    {
        try {
            repository.deleteById (
                    id );
        } catch ( Exception ex ) {
            throw new UserNotFoundException (
                    ex.getMessage ( ) );
        }
        return 0;
    }

}
