package com.occamasrazor.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	private Map<String, Object> map;
	public UserServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void add(User user) {
		System.out.println("회원가입 확인  :"+ user);
		map.put(user.getUserid(), user);
	}
	@Override
	public int count() {
		return map.size();
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
			User u =detail(user.getUserid());
			if(user.getPassword().equals(u.getPassword())) {
				returnUser =u;
				System.out.println("로그인 :" + returnUser);
			}
		}
		return returnUser;
	}
	@Override
	public User detail(String userid) {
		System.out.println("디테일: "+ userid);
		User t = (User) map.get(userid);
		System.out.println("map이후 " + t);
		return t;
	}
	@Override
	public boolean update(User user) {
		map.replace(user.getUserid(), user);
		return true;
	}
	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}


}
