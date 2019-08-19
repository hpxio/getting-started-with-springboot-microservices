package com.app.rc.gettingStartedWithSpringBootMicroservice.ui.model.request;

public class WelcomeRequestModel {

    private String name;

    @Override
    public String toString ( )
    {
        return "WelcomeRequestModel [name=" + name + "]";
    }

    /**
     * @param name
     */
    public WelcomeRequestModel ( String name ) {
        this.name = name;
    }

    public WelcomeRequestModel ( ) {

    }

    /**
     * @return the name
     */
    public String getName ( )
    {
        return name;
    }

    /**
     * @param name
     *                 the name to set
     */
    public void setName (
            String name )
    {
        this.name = name;
    }

}
