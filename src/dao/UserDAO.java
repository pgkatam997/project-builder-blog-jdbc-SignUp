package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

import utility.ConnectionManager;

public  class UserDAO implements UserDaoInterface{
	   String signup="inser into USERS VALUES (?,?)";
	   String login="select * from USERS where EMAIL=? and PASSWORD=?";
	   
	   public int signUp(User user) throws ClassNotFoundException, IOException, SQLException {
		   Connection con=null;
		   con=ConnectionManager.getConnection();
		   PreparedStatement prep=con.prepareStatement(signup);
		   prep.setString(1,((model.User) user).getEmail());
		   prep.setString(2,user.getPassword());
		   int execution =prep.executeUpdate();
		   return execution;		   
	   }
	   
	   public boolean loginUser(model.User user) throws ClassNotFoundException, IOException, SQLException {
		   Connection con=null;
		   con=ConnectionManager.getConnection();
		   PreparedStatement prep=con.prepareStatement(login);
		   prep.setString(1,user.getEmail());
		   prep.setString(2, user.getPassword());
		   
		   ResultSet rs=prep.executeQuery();
		   return false;
		   
	   }

	@Override
	public boolean loginUser(User user) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public int signUP(model.User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}