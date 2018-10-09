package com.springboot.swaggerexample.models;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Mariana on 09.10.2018.
 */
public class Parent {

    @ApiModelProperty(notes = "login of the parent")
    private String login;

    @ApiModelProperty(notes = "password of the parent")
    private String password;

    @ApiModelProperty(notes = "email of the parent")
    private String email;

    @ApiModelProperty(notes = "name of the parent")
    private String firstName;

    @ApiModelProperty(notes = "surname of the parent")
    private String lastName;

    public Parent(String login, String password, String email, String firstName, String lastName)
    {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
