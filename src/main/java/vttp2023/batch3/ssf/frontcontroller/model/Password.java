// package vttp2023.batch3.ssf.frontcontroller.model;

// import java.io.Serializable;

// import jakarta.json.JsonObject;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Size;

// public class Password implements Serializable {

//     @NotNull(message="Please state your name")
//     @Size(min=2, message="Your password must be at least 2 characters")
//     @NotBlank(message="Please state your name")
//     private String password;

//     public String getPasswordd() {
//         return password;
//     }

//     public void setPasswordd(String password) {
//         this.password = password;
//     }

//     public static Password create(JsonObject L){
//         Password p = new Password();
//         p.setPasswordd(L.getString("password"));

//         return  p;
//     }
    
// }
