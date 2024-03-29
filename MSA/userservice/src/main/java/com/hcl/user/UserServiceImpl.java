package com.hcl.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserByName(String name) {
		List<User> lst=new ArrayList<User>();
		lst=userRepository.getUserByUserName(name);
		return lst.get(0);
	}

	@Override
	public String registerUser(User user) {

			User temp=userRepository.save(user);
					String str="";
					if (temp != null) {
						str= "Registered Successfully";
					} else {
						str= "Please Enter valid details";
					}
				
				return str;
		}
	}


