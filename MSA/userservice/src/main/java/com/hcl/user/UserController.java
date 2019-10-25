package com.hcl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/getUser/{name}")
	public ResponseEntity<User> getUser(@PathVariable("name") String name) {
		User tempname = userService.getUserByName(name);
		if (name.equals(tempname.getName())) {
		return new ResponseEntity<User>(tempname, HttpStatus.OK) ;
		}else {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping("/registerUser")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		String a=userService.registerUser(user);
		if(a.equals("Registered Successfully")) {
			return new ResponseEntity<String>( HttpStatus.OK);
		} else {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		

	}
}
