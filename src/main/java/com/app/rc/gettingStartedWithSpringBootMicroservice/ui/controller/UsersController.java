package com.app.rc.gettingStartedWithSpringBootMicroservice.ui.controller;

import com.app.rc.gettingStartedWithSpringBootMicroservice.service.UsersService;
import com.app.rc.gettingStartedWithSpringBootMicroservice.shared.dto.UsersDTO;
import com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.request.UsersRequestModel;
import com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.response.UsersResponseModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *
 */
@RestController
@RequestMapping(path = "/users")
public class UsersController {

    final
    UsersService userService;

    @Autowired
    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    /**
     * <p>
     * Get User data by UUID
     * </p>
     * <p>
     * <b>Objective-1:</b>Get users by UUID<br/>
     * <b>Expected-URL:</b>http://localhost:port/users/[0-n](Integer)<br/>
     * <b>Example:</b>http://localhost:8089/users/2<br/>
     * </p>
     *
     * @param id UUID of the record to find
     * @return User data in JSON format
     */
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UsersResponseModel getUserByIdController(@PathVariable(required = true) int id) {
        UsersResponseModel response = new UsersResponseModel();
        UsersDTO result = userService.getUserById(id);
        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * <p>
     * Method-Info
     * </p>
     * <p>
     * <b>Objective-1:</b>Objective-of-Method<br/>
     * <b>Expected-URL:</b><br/>
     * <b>Example:</b><br/>
     * </p>
     *
     * @param request info
     * @return info
     */
    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public UsersResponseModel createUserController(@Valid @RequestBody UsersRequestModel request) {
        UsersDTO usersDto = new UsersDTO();
        UsersResponseModel response = new UsersResponseModel();
        BeanUtils.copyProperties(request, usersDto);
        UsersDTO result = userService.createUser(usersDto);
        BeanUtils.copyProperties(result, response);
        return response;
    }

    /**
     * <p>
     * Method-Info
     * </p>
     * <p>
     * <b>Objective-1:</b>Objective-of-Method<br/>
     * <b>Expected-URL:</b><br/>
     * <b>Example:</b><br/>
     * </p>
     *
     * @param name info
     * @return info
     */
    @RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable(required = true) long id) {
        userService.deleteUser(id);
    }
}
