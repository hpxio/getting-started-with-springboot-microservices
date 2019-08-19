package com.app.rc.gettingStartedWithSpringBootMicroservice.ui.controller;

import com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.request.WelcomeRequestModel;
import com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.response.WelcomeResponseModel;
import org.springframework.web.bind.annotation.*;

/**
 * Default controller class
 * @author iHSPA
 */
@RestController
@RequestMapping(path = "/")
public class WelcomeUserController {

    /**
     * Default end-point for server status check
     * @return
     */
    @GetMapping
    public String welcomeString() {
        return "Welcome User";
    }

    /**
     * FIXME: #Not-Workinger
     *
     * @param name
     * @return
     */
    @GetMapping(path = "/welcome/{name}")
    public WelcomeResponseModel welcomeUser(
            @PathVariable(value = "name") String name) {
        return new WelcomeResponseModel(name);
    }

    /**
     * Here's a special case of path variable mapping. Here
     * we have only passed the REQUEST POJO in the method
     * argument.
     * Spring can automatically map the path variable with
     * the pojo member given that the name of the parameter
     * is exactly the same as declared in the POJO. This
     * is done by object interception, a feature implemented
     * in Spring Boot libraries.
     *
     * @param welcomerequestModel
     * @return
     */
    @RequestMapping(
            path = "/welcome",
            method = RequestMethod.GET)
    public WelcomeResponseModel welcomeUserWithRequest(WelcomeRequestModel welcomerequestModel) {
        return new WelcomeResponseModel("Welcome " + welcomerequestModel.getName());
    }

}
