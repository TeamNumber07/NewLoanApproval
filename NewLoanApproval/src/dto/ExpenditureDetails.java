package dto;

public class ExpenditureDetails {

	private  int expenditureDetailsId;
	private int userId;
	private String previous_Loan;
	private double previous_Loan_Amount;
	private int loan_Duration;
	private int remaining_Time_Period;
	private double emi;
	private double pending_Amount;
	private double yearly_Expenditure;
	
	public ExpenditureDetails() {
		emi = 0.0;
        previous_Loan_Amount = 0.0;
        loan_Duration = 0;
        remaining_Time_Period = 0;
        pending_Amount = 0.0;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPrevious_Loan() {
		return previous_Loan;
	}

	public void setPrevious_Loan(String previous_Loan) {
		this.previous_Loan = previous_Loan;
	}

	public double getPrevious_Loan_Amount() {
		return previous_Loan_Amount;
	}

	public void setPrevious_Loan_Amount(double previous_Loan_Amount) {
		this.previous_Loan_Amount = previous_Loan_Amount;
	}

	public int getLoan_Duration() {
		return loan_Duration;
	}

	public void setLoan_Duration(int loan_Duration) {
		this.loan_Duration = loan_Duration;
	}

	public int getRemaining_Time_Period() {
		return remaining_Time_Period;
	}

	public void setRemaining_Time_Period(int remaining_Time_Period) {
		this.remaining_Time_Period = remaining_Time_Period;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getPending_Amount() {
		return pending_Amount;
	}

	public void setPending_Amount(double pending_Amount) {
		this.pending_Amount = pending_Amount;
	}

	public double getYearly_Expenditure() {
		return yearly_Expenditure;
	}

	public void setYearly_Expenditure(double yearly_Expenditure) {
		this.yearly_Expenditure = yearly_Expenditure;
	}
	
	@Override
	public String toString() {
		return userId +" "+ previous_Loan + " " + previous_Loan_Amount	+ " " + loan_Duration + " " + remaining_Time_Period + " "
				+ emi + " " + pending_Amount + " " + yearly_Expenditure ;
	}
	
}
