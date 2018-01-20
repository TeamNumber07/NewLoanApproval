package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.MyConn;
import dto.ExpenditureDetails;


public class ExpenditureDao {

	private MyConn mcon;

	public ExpenditureDao() {
		mcon=new MyConn();
	
	}
	
	public ExpenditureDetails getExpenditureDetails(ExpenditureDetails ed) throws SQLException  {
		
		ExpenditureDetails e = new ExpenditureDetails();
		
		Connection con = mcon.getConn();
		String query = "select * from ExpenditureDetails where userid=?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, ed.getUserId());
	
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			e.setUserId(rs.getInt(1));
			e.setPrevious_Loan(rs.getString(2));
			e.setPrevious_Loan_Amount(rs.getDouble(3));
			e.setLoan_Duration(rs.getInt(4));
			e.setRemaining_Time_Period(rs.getInt(5));
			e.setEmi(rs.getDouble(6));
			e.setPending_Amount(rs.getDouble(7));
			e.setYearly_Expenditure(rs.getDouble(8));
		}
		
		return e;
		
		
		
	}
	
	
	
}
