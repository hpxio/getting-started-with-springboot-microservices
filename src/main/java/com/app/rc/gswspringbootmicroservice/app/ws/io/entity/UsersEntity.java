package com.app.rc.gswspringbootmicroservice.app.ws.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity ( name = "users" )
public class UsersEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Column ( unique = true )
    private String username;

    @NotNull
    private String password;

    @NotNull
    @Column ( unique = true )
    private String accessKey;

    private boolean status;

    public UsersEntity ( ) {

    }

    public UsersEntity ( int id, String username,
            String password, String accessKey,
            boolean status ) {
        super ( );
        this.id = id;
        this.username = username;
        this.password = password;
        this.accessKey = accessKey;
        this.status = status;
    }

    @Override
    public String toString ( )
    {
        return "UsersEntity [id=" + id + ", username="
                + username + ", password=" + password
                + ", accessKey=" + accessKey + ", status="
                + status + "]";
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

    /**
     * @return the status
     */
    public boolean isStatus ( )
    {
        return status;
    }

    /**
     * @param status
     *                   the status to set
     */
    public void setStatus (
            boolean status )
    {
        this.status = status;
    }

}
