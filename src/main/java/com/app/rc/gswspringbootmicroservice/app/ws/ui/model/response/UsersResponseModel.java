package com.app.rc.gswspringbootmicroservice.app.ws.ui.model.response;

public class UsersResponseModel {

    private int id;

    private String username;

    private String accessKey;

    public UsersResponseModel ( ) {
    }

    /**
     * @param id
     * @param username
     * @param accessKey
     */
    public UsersResponseModel ( int id, String username,
            String accessKey ) {
        super ( );
        this.id = id;
        this.username = username;
        this.accessKey = accessKey;
    }

    @Override
    public String toString ( )
    {
        return "UsersResponseModel [id=" + id
                + ", username=" + username + ", accessKey="
                + accessKey + "]";
    }

    /**
     * @return the id
     */
    public int getId ( )
    {
        return id;
    }

    /**
     * @param id
     *               the id to set
     */
    public void setId (
            int id )
    {
        this.id = id;
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
     * @return the accessKey
     */
    public String getAccessKey ( )
    {
        return accessKey;
    }

    /**
     * @param accessKey
     *                      the accessKey to set
     */
    public void setAccessKey (
            String accessKey )
    {
        this.accessKey = accessKey;
    }

}
