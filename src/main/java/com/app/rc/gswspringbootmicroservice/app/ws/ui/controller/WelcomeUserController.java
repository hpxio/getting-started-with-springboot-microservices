package com.app.rc.gswspringbootmicroservice.app.ws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.rc.gswspringbootmicroservice.app.ws.ui.model.request.WelcomeRequestModel;
import com.app.rc.gswspringbootmicroservice.app.ws.ui.model.response.WelcomeResponseModel;

/**
 * @author Harsh
 */
@RestController
@RequestMapping ( path = "/" )
public class WelcomeUserController {

    /**
     * @return
     */
    @GetMapping
    public String welcomeString ( )
    {
        return "Welcome User";
    }

    /**
     * FIXME: #Not-Workinger
     * 
     * @param name
     * @return
     */
    @GetMapping ( path = "/welcome/{name}" )
    public WelcomeResponseModel welcomeUser (
            @PathVariable ( value = "name" ) String name )
    {
        return new WelcomeResponseModel ( name );
    }

    /**
     * Here's a special case of path variable mapping. Here
     * we have only passed the REQUEST POJO in the method
     * argument.
     * Spring can automatically map the path variable with
     * the pojo member given that the name of the parameter
     * is exacxtly the same as declared in the class. This
     * is done by object interception, a feature implemented
     * in Spring Boot libraries.
     * 
     * @param welcomerequestModel
     * @return
     */
    @RequestMapping (
            path = "/welcome",
            method = RequestMethod.GET )
    public WelcomeResponseModel welcomeUserWithRequest (
            WelcomeRequestModel welcomerequestModel )
    {
        return new WelcomeResponseModel ( "Welcome "
                + welcomerequestModel.getName ( ) );
    }

}
