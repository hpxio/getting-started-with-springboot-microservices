package com.app.rc.gswspringbootmicroservice.app.ws.ui.model.response;

/**
 * @author Harsh
 */
public class WelcomeResponseModel {

    private String name;

    /**
     * 
     */
    public WelcomeResponseModel ( ) {

    }

    /**
     * @param name
     */
    public WelcomeResponseModel ( String name ) {
        super ( );
        this.name = name;
    }

    @Override
    public String toString ( )
    {
        return "WelcomeUserResponse [name=" + name + "]";
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
