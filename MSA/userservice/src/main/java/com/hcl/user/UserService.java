package com.hcl.user;

import java.util.List;

public interface UserService {
	public User getUserByName(String name);

	public String registerUser(User user);
}
