package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.MyConn;
import dto.FinancialDetails;

public class FinancialDetailsDao {
	
	private MyConn mycon;
	
	public FinancialDetailsDao() {
		mycon=new MyConn();
	}
	
	public boolean addFinancialDetails(FinancialDetails fd)  throws SQLException{
		boolean flag = false;
		
		Connection con=mycon.getConn();
		String query="insert into FinancialDetails(userid,nature_of_occupation,employer_name,total_Experience,designation,yearly_Income,pan_No) values (?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, fd.getUserId());
		ps.setString(2, fd.getNature_of_occupation());
		ps.setString(3, fd.getEmployer_Name());
		ps.setInt(4, fd.getTotal_Experience());
		ps.setString(5, fd.getDesignation());
		ps.setDouble(6, fd.getYearly_Income());
		ps.setString(7, fd.getPan_No());
		
		System.out.println(query);
		flag=ps.execute();
		
		con.close(); 
		return flag;
	}
	public FinancialDetails getFinancialDetails(FinancialDetails f) throws SQLException{
		FinancialDetails fd=new FinancialDetails();
		
		Connection con=mycon.getConn();
		String query="select * from FinancialDetails where userid=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, f.getUserId());
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			fd.setFinancialDetailsId(rs.getInt(1));
			fd.setUserId(rs.getInt(2));
			fd.setNature_of_occupation(rs.getString(3));
			fd.setEmployer_Name(rs.getString(4));
			fd.setTotal_Experience(rs.getInt(5));
			fd.setDesignation(rs.getString(6));
			fd.setYearly_Income(rs.getDouble(7));
			fd.setPan_No(rs.getString(8));
		}
		return fd;
	}
	public List<FinancialDetails> getAllFinancialDetails() throws SQLException
	{
		List<FinancialDetails>flist=new ArrayList<>();
		
		Connection con=mycon.getConn();
		String query="select * from FinancialDetails";
		PreparedStatement ps=con.prepareStatement(query);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			FinancialDetails fd=new FinancialDetails();
			fd.setFinancialDetailsId(rs.getInt(1));
			fd.setUserId(rs.getInt(2));
			fd.setNature_of_occupation(rs.getString(3));
			fd.setEmployer_Name(rs.getString(4));
			fd.setTotal_Experience(rs.getInt(5));
			fd.setDesignation(rs.getString(6));
			fd.setYearly_Income(rs.getDouble(7));
			fd.setPan_No(rs.getString(8));
			flist.add(fd);
		}
		return flist;
	}
}
