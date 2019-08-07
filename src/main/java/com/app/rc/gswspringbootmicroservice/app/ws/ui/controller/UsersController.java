package com.app.rc.gswspringbootmicroservice.app.ws.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.rc.gswspringbootmicroservice.app.ws.service.UsersService;
import com.app.rc.gswspringbootmicroservice.app.ws.shared.dto.UsersDTO;
import com.app.rc.gswspringbootmicroservice.app.ws.ui.model.request.UsersRequestModel;
import com.app.rc.gswspringbootmicroservice.app.ws.ui.model.response.UsersResponseModel;

@RestController
@RequestMapping ( path = "/users" )
public class UsersController {

    @Autowired
    UsersService userService;

    /**
     * @param id
     * @return
     */
    @RequestMapping (
            path = "/{id}",
            method = RequestMethod.GET,
            produces = "application/JSON" )
    public UsersResponseModel getUserByIdController (
            @PathVariable ( required = true ) int id )
    {
        UsersResponseModel response = new UsersResponseModel ( );
        UsersDTO result = userService.getUserById (
                id );
        BeanUtils.copyProperties (
                result,
                response );
        return response;
    }

    /**
     * @param request
     * @return
     */
    @RequestMapping (
            path = "/create",
            method = RequestMethod.POST )
    public UsersResponseModel createUserController (
            @Valid @RequestBody UsersRequestModel request )
    {
        UsersDTO usersDto = new UsersDTO ( );
        UsersResponseModel response = new UsersResponseModel ( );

        BeanUtils.copyProperties (
                request,
                usersDto );

        UsersDTO result = userService.createUser (
                usersDto );

        BeanUtils.copyProperties (
                result,
                response );

        return response;
    }

    /**
     * @param id
     */
    @RequestMapping (
            path = "/delete/{id}",
            method = RequestMethod.DELETE )
    public void deleteUser (
            @PathVariable ( required = true ) long id )
    {
        userService.deleteUser (
                id );
    }
}
