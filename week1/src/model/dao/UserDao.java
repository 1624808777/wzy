package model.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.resource.cci.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.User;


public  class UserDao {
	public User get(String userName,String password) {
		User user = new User();
		try {
			//1.��������
			Class.forName("com.mysql.jbdc.Driver");
			//2.���������ݿ������
			Connection con=DriverManager.getConnection(
					"jbdc:mysql:127.0.0.1:3306/User",
					"root", "123456");
			//3.�������
			String sql="select * from t_user where username=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, userName);
			//4.ִ�����
			java.sql.ResultSet rs=pst.executeQuery();
			//5.������
			if(rs.next()){
//				user=new User(rs.getString("userName"),
//						rs.getString("password"),
//						rs.getString("chrName"),rs.getString("role"));
				user.setName(rs.getString("userName"));
				user.setName(rs.getString("password"));
				user.setName(rs.getString("chrName"));
				user.setName(rs.getString("role"));
			}
			//6.�ر�����
			con.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return user;
		}

	public User get1(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object get(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
