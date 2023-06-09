// package vttp2023.batch3.ssf.frontcontroller.model;

// import java.io.Serializable;

// import jakarta.json.JsonObject;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Size;

// public class Username implements Serializable {

//     @NotNull(message="Please state your name")
//     @Size(min=2, message="Your username must be at least 2 characters")
//     @NotBlank(message="Please state your name")
//     private String username;

//     public String getUsernamee() {
//         return username;
//     }

//     public void setUsernamee(String username) {
//         this.username = username;
//     }

//     public static Username create(JsonObject L){
//         Username u = new Username();
//         u.setUsernamee(L.getString("username"));

//         return  u;
//     }
    
// }
