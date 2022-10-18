package com.bena;

public class User {
    private String uanme;
    private String passwd;

    public User() {
    }

    public User(String uanme, String passwd) {
        this.uanme = uanme;
        this.passwd = passwd;
    }

    public String getUanme() {
        return uanme;
    }

    public void setUanme(String uanme) {
        this.uanme = uanme;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uanme='" + uanme + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
    public void shoe(){
        System.out.println();
    }
}
