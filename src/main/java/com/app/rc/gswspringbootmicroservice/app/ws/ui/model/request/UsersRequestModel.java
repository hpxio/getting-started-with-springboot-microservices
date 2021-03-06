package com.app.rc.gswspringbootmicroservice.app.ws.ui.model.request;

public class UsersRequestModel {

    private String username;

    private String password;

    @Override
    public String toString ( )
    {
        return "UsersRequestModel [username=" + username
                + ", password=" + password + "]";
    }

    public UsersRequestModel ( ) {

    }

    /**
     * @param username
     * @param password
     */
    public UsersRequestModel ( String username,
            String password ) {
        super ( );
        this.username = username;
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername ( )
    {
        return username;
    }

    /**
     * @param username
     *                     the username to set
     */
    public void setUsername (
            String username )
    {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword ( )
    {
        return password;
    }

    /**
     * @param password
     *                     the password to set
     */
    public void setPassword (
            String password )
    {
        this.password = password;
    }

}
