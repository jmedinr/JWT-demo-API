package com.DEMOJWT.demo.model;

import com.DEMOJWT.demo.dto.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usuarios")
public class UserModel {

    @Id
    private String id;

    private String user;
    private String pwd;
    private String token;

    public UserModel() {
    }

    public UserModel(String user, String pwd, String token) {
        this.user = user;
        this.pwd = pwd;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

}
