package it.cinema.service;


import java.util.List;

import it.cinema.entity.User;
public interface UserService {

	public List<User> getList();
	public void saveUser(User theUser);
	public User getUser(int theCodVisitatore);
	public User getUser(String email, String password);
	public void deleteUser(int theCodVisitatore);

}
