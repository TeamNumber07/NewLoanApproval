package dto;

public class FinancialDetails {
	
	private int financialDetailsId;
	private int userId;
	private String nature_of_occupation;
	private String employer_Name;
	private int total_Experience;
	private String designation;
	private double yearly_Income;
	private String pan_No;
	
	public int getFinancialDetailsId() {
		return financialDetailsId;
	}
	public int getUserId() {
		return userId;
	}
	public String getNature_of_occupation() {
		return nature_of_occupation;
	}
	public String getEmployer_Name() {
		return employer_Name;
	}
	public int getTotal_Experience() {
		return total_Experience;
	}
	public String getDesignation() {
		return designation;
	}
	public double getYearly_Income() {
		return yearly_Income;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setFinancialDetailsId(int financialDetailsId) {
		this.financialDetailsId = financialDetailsId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setNature_of_occupation(String nature_of_occupation) {
		this.nature_of_occupation = nature_of_occupation;
	}
	public void setEmployer_Name(String employer_Name) {
		this.employer_Name = employer_Name;
	}
	public void setTotal_Experience(int total_Experience) {
		this.total_Experience = total_Experience;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setYearly_Income(double yearly_Income) {
		this.yearly_Income = yearly_Income;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	@Override
	public String toString() {
		return financialDetailsId + " " + userId
				+ " " + nature_of_occupation + " " + employer_Name
				+ " " + total_Experience + " " + designation + " "
				+ yearly_Income + " " + pan_No;
	}
	
	
}
