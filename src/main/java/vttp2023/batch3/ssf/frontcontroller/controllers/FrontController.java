package vttp2023.batch3.ssf.frontcontroller.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import vttp2023.batch3.ssf.frontcontroller.model.Login;
import vttp2023.batch3.ssf.frontcontroller.services.AuthenticationService;

@RestController
@RequestMapping(consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public class FrontController {

	// TODO: Task 2, Task 3, Task 4, Task 6

    @Autowired
    public AuthenticationService authService;

    @PostMapping(path="/login")
    private String getUser(@RequestBody MultiValueMap<String, String> form, Model model){

		String username = form.getFirst("username");
		String password = form.getFirst("password");
		try {
			AuthenticationService.authenticate(username, password);

		
	}


		
}
	

	@PostMapping(path="/login/authenticate")
	public String postLogin(Model m, HttpSession session,
	@Valid Login login, BindingResult result){

	if(result.hasErrors()){
		login.setAuthentication(false);
		int usernameCount =+ 1;
		return "view3";
	}

	login.setAuthentication(true);
	return "view2";

	}
}
		
		
		

	


	

//         List<ObjectError> errors = Login.validatePizzaOrder(login);
//         if(!errors.isEmpty()){
//             for(ObjectError e :errors)
//                 result.addError(e);
//             return "index";
//         }

//         sesssion.setAttribute("login", login);
//         m.addAttribute("delivery", new Delivery());
//         return "delivery";
//     }

//     @PostMapping(path="/pizza/order")
//     public String postPizzaOrder(Model model, HttpSession session,
//         @Valid Delivery delivery, BindingResult result){

//         if(result.hasErrors()){
//             return "delivery";
//         }
//         Pizza p = (Pizza) session.getAttribute("pizza");
//         Order o = pizzaSvc.savePizza(p, delivery);
//         model.addAttribute("order", o);
//         return "order";
//     }
// }

	
}

}