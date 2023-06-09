package vttp2023.batch3.ssf.frontcontroller.services;

import java.util.Random;

public class AuthenticationService {

	// TODO: Task 2
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write the authentication method in here
	public void authenticate(String username, String password) throws Exception {

		if(password == (username.concat(username)) {
			login.setAuthentication = true;


		}


		
		)

	}

	

	// TODO: Task 3
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write an implementation to disable a user account for 30 mins
	public void disableUser(String username) {

		

		int a = 0;
		int b = 0;
		int answer = 0;
		
		Random randomNum = new Random();
		a = Random().nextInt((49)+1);
		b = new Random().nextInt((49)+1);

		Random operatorChoice = new Random();
        int operator = operatorChoice.nextInt(4);

        switch (operator){

            case 0: = "+";
                answer = a+b;
                break;
            case 1: operatorSwitch= "-";
                answer = a-b;
                break;
            case 2: operatorSwitch= "*";
                answer = a*b;
                break;
            case 3: operatorSwitch= "/";
                answer = a/b;
                break;
            default: operatorSwitch= "";
        }



	}

	private Random Random() {
		return null;
	}



	// TODO: Task 5
	// DO NOT CHANGE THE METHOD'S SIGNATURE
	// Write an implementation to check if a given user's login has been disabled
	public boolean isLocked(String username) {
		if 
		return false;
	}
}
