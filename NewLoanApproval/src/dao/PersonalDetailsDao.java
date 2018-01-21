package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.MyConn;
import dto.PersonalDetails;

public class PersonalDetailsDao {
	
	private MyConn mycon;
	
	public PersonalDetailsDao() {
		mycon=new MyConn();
	}
	
	public boolean addPersonalDetails(PersonalDetails pd)  throws SQLException{
		boolean flag = false;
		
		Connection con=mycon.getConn();
		String query="insert into personaldetails(userid,username,gender,birthDate,address,city,pincode,state,emailid,mobnumber) values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, pd.getUserId());
		ps.setString(2, pd.getUserName());
		ps.setString(3, pd.getGender());
		ps.setDate(4, pd.getBirthDate());
		ps.setString(5, pd.getAddress());
		ps.setString(6, pd.getCity());
		ps.setInt(7, pd.getPincode());
		ps.setString(8, pd.getState());
		ps.setString(9, pd.getEmailId());
		ps.setInt(10, pd.getMobNumber());
		
		System.out.println(query);
		flag=ps.execute();
		
		con.close(); 
		return flag;
	}
	public PersonalDetails getPersonalDetails(PersonalDetails p) throws SQLException{
		PersonalDetails pd=new PersonalDetails();
		
		Connection con=mycon.getConn();
		String query="select * from personaldetails where userid=? or username=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, p.getUserId());
		ps.setString(2, p.getUserName());
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			pd.setPersonalDetailId(rs.getInt(1));
			pd.setUserId(rs.getInt(2));
			pd.setUserName(rs.getString(3));
			pd.setGender(rs.getString(4));
			pd.setBirthDate(rs.getDate(5));
			pd.setAddress(rs.getString(6));
			pd.setCity(rs.getString(7));
			pd.setPincode(rs.getInt(8));
			pd.setState(rs.getString(9));
			pd.setEmailId(rs.getString(10));
		}
		return pd;
	}
	public List<PersonalDetails> getAllPersonalDetails() throws SQLException
	{
		List<PersonalDetails>plist=new ArrayList<>();
		
		Connection con=mycon.getConn();
		String query="select * from personaldetails";
		PreparedStatement ps=con.prepareStatement(query);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			PersonalDetails pd=new PersonalDetails();
			pd.setPersonalDetailId(rs.getInt(1));
			pd.setUserId(rs.getInt(2));
			pd.setUserName(rs.getString(3));
			pd.setGender(rs.getString(4));
			pd.setBirthDate(rs.getDate(5));
			pd.setAddress(rs.getString(6));
			pd.setCity(rs.getString(7));
			pd.setPincode(rs.getInt(8));
			pd.setState(rs.getString(9));
			pd.setEmailId(rs.getString(10));
			plist.add(pd);
		}
		return plist;
	}
}