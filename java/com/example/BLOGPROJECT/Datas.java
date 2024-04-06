package com.example.BLOGPROJECT;

public class Datas{

    public String username;
    public String password;
    public Datas(String s,String a){
        this.username = s;
        this.password = a;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setUsername(String u){ this.username = u;}

    public void setPassword(String u){ this.password = u;}

}
