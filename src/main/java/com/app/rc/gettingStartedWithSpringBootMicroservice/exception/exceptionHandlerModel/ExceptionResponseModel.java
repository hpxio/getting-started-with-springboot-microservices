package com.app.rc.gettingStartedWithSpringBootMicroservice.exception.exceptionHandlerModel;

import java.util.Date;

public class ExceptionResponseModel {

    private String message;

    private String description;

    private Date timestamp;

    public ExceptionResponseModel() {

    }

    /**
     * @param message
     * @param description
     * @param timestamp
     */
    public ExceptionResponseModel(String message,
                                  String description, Date timestamp) {
        super();
        this.message = message;
        this.description = description;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ExceptionModel [message=" + message
                + ", description=" + description
                + ", timestamp=" + timestamp + "]";
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(
            String message) {
        this.message = message;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(
            String description) {
        this.description = description;
    }

    /**
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(
            Date timestamp) {
        this.timestamp = timestamp;
    }

}
