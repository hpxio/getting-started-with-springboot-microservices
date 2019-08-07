package com.app.rc.gswspringbootmicroservice.app.ws.exceptionHandlers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.rc.gswspringbootmicroservice.app.ws.exceptionHandlers.model.ExceptionResponseModel;

@ControllerAdvice
@RestController
public class CustomExceptionHandler
        extends ResponseEntityExceptionHandler {

    /**
     * @param ex
     * @param request
     * @return
     * @throws Exception
     */
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object>
    fallbackExceptionHandler(
            Exception ex,
            WebRequest request)
            throws Exception {

        ExceptionResponseModel response = new ExceptionResponseModel(
                ex.getMessage(), request.getDescription(
                false),
                new Date());

        return new ResponseEntity<Object>(response,
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * @param ex
     * @param request
     * @return
     * @throws Exception
     */
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object>
    userNotFoundExceptionHandler(
            UserNotFoundException ex,
            WebRequest request)
            throws Exception {

        ExceptionResponseModel response = new ExceptionResponseModel(
                ex.getMessage(), request.getDescription(
                false),
                new Date());

        return new ResponseEntity<Object>(response,
                HttpStatus.NOT_FOUND);
    }

}
