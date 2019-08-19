package com.app.rc.gettingStartedWithSpringBootMicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus ( HttpStatus.NOT_FOUND )
public class UserNotFoundException
        extends RuntimeException {

    private static final long serialVersionUID = 1305265756475047165L;

    /**
     * @param message
     */
    public UserNotFoundException ( String message ) {
        super ( message );
    }

}
