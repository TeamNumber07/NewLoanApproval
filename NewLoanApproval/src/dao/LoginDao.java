package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.MyConn;
import dto.Login;

public class LoginDao{
	private MyConn mcon;
	public LoginDao() {
		mcon=new MyConn();
	}
	
	public boolean login(Login login) throws SQLException, ClassNotFoundException {
		boolean flag = false;
		Connection con = mcon.getConn();
		PreparedStatement ps = con.prepareStatement("select * from adminlogin where adminname = ? and adminpass = ?");
		ps.setString(1, login.getAdminName());
		ps.setString(2, login.getAdminPass());
		
		//System.out.println(login);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			flag=true;
		}
		con.close(); 
		return flag;
	}
}