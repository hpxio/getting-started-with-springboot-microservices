package com.app.rc.gswspringbootmicroservice.app.ws.service;

import com.app.rc.gswspringbootmicroservice.app.ws.exceptionHandlers.UserNotFoundException;
import com.app.rc.gswspringbootmicroservice.app.ws.shared.dto.UsersDTO;

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
