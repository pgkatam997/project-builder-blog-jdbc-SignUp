package dao;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.catalina.User;

interface UserDaoInterface{
	public int signUp(User user) throws ClassNotFoundException,SQLException,IOException;
	public boolean loginUser(User user) throws ClassNotFoundException,IOException,SQLException;
	
}