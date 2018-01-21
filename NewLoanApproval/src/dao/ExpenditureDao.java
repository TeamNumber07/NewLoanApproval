package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.MyConn;
import dto.ExpenditureDetails;


public class ExpenditureDao {

	private MyConn mcon;

	public ExpenditureDao() {
		mcon=new MyConn();
	
	}
	
	//To insert User ExpenditureDetails into database
		public boolean addExpenditureDetails(ExpenditureDetails ed)
		{
			boolean flag = false;
			try {
				Connection con = mcon.getConn();
				String query = "insert into expenditure_details(previous_loan, previous_loan_amount,loan_duration,remaining_time_period,emi,pending_amount,yearly_expenditure )values(?,?,?,?,?,?,?) ";
				
				PreparedStatement ps = con.prepareStatement(query);
				
				ps.setString(1,ed.getPrevious_Loan());
				ps.setDouble(2, ed.getPrevious_Loan_Amount());
				ps.setInt(3, ed.getLoan_Duration());
				ps.setInt(4, ed.getRemaining_Time_Period());
				ps.setDouble(5, ed.getEmi());
				ps.setDouble(6, ed.getPending_Amount());
				ps.setDouble(7, ed.getYearly_Expenditure());
				
				ps.executeUpdate();
				
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return flag;
			
		}
		
		
		// To fetch single records
		public ExpenditureDetails getExpenditureDetails(ExpenditureDetails ed) throws SQLException  {
			
			ExpenditureDetails e = new ExpenditureDetails();
			
			Connection con = mcon.getConn();
			String query = "select * from expenditure_details where userid=?";
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

		
		
		// To fetch Multiple Records 
		public ArrayList<ExpenditureDetails> selectExpenditureDetails()
		{
			//To store multiple records arraylist is used
			ArrayList<ExpenditureDetails> list = new ArrayList<ExpenditureDetails>();
			
			try {
				Connection con = mcon.getConn();
				PreparedStatement s = con.prepareStatement("select * from expenditure_details");
				ResultSet rs = s.executeQuery();
				while (rs.next()) {
					ExpenditureDetails ed = new ExpenditureDetails();

					ed.setUserId(rs.getInt(1));
					ed.setPrevious_Loan(rs.getString(2));
					ed.setPrevious_Loan_Amount(rs.getDouble(3));
					ed.setLoan_Duration(rs.getInt(4));
					ed.setRemaining_Time_Period(rs.getInt(5));
					ed.setEmi(rs.getDouble(6));
					ed.setPending_Amount(rs.getDouble(7));
					ed.setYearly_Expenditure(rs.getDouble(8));
					list.add(ed);	
				}
				con.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;  //it is accessed from anywhere it contains ExpenditureDetails object
		}
		
		
	}
