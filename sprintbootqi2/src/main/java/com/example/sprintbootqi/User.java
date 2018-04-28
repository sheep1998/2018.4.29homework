package com.example.sprintbootqi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    private String name;
    @Column
    private String password;

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
}
