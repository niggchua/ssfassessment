package vttp2023.batch3.ssf.frontcontroller.model;

import java.io.Serializable;
import java.io.StringReader;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Login implements Serializable{


    // private Username user;
    // private Password pw;

    // public Login(Username u, Password p){
    //     this.user = u;
    //     this.pw = p;
    // }

    // public Username getUsername() {
    //     return user;
    // }
    // public void setUsername(Username user) {
    //     this.user = user;
    // }
    // public Password getPassword() {
    //     return pw;
    // }
    // public void setPassword(Password pw) {
    //     this.pw = pw;
    // }



    // public String getUser() { return this.getUsername().getUsernamee();}
    // public String getPw() {return this.getPassword().getPasswordd();}


    // public static Login create(JsonObject l){
    //     Login l = new Login();


    // }



    @NotNull(message="Please state your name")
    @Size(min=2, message="Your username must be at least 2 characters")
    @NotBlank(message="Please state your name")
    private String username;

    @NotNull(message="Please state your name")
    @Size(min=2, message="Your password must be at least 2 characters")
    @NotBlank(message="Please state your name")
    private String password;

    private boolean authentication;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAuthentication() {
        return this.authentication;
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }


    public static JsonObject toJSON(String json){
        JsonReader r = (JsonReader) Json.createReader(new StringReader(json));
        return r.readObject();
    }

    public JsonObject toJSON(){
        return Json.createObjectBuilder()
                .add("user", this.getUsername())
                .add("password", this.getPassword())
                .build();
    }

    

 

}

