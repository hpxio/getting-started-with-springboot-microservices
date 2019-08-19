package com.app.rc.gettingStartedWithSpringBootMicroservice.service;

import com.app.rc.gettingStartedWithSpringBootMicroservice.exception.UserNotFoundException;
import com.app.rc.gettingStartedWithSpringBootMicroservice.shared.dto.UsersDTO;

public interface UsersService {

    /**
     * FIXME: Exception handling needs to be improved here.
     * Get User by know ID
     * 
     * @param id
     * @return
     */
    public UsersDTO getUserById (
            int id )
            throws UserNotFoundException;

    /**
     * @param usersDto
     * @return
     */
    public UsersDTO createUser (
            UsersDTO usersDto );

    /**
     * @param id
     * @return
     */
    public int deleteUser (
            long id );

}
