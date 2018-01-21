package dto;

import java.sql.Date;

public class PersonalDetails {
	
	private int personalDetailId;
	private int userId;
	private String userName;
	private String gender;
	private Date birthDate;
	private String address;
	private String city;
	private int pincode;
	private String state;
	private String emailId;
	private int mobNumber;
	
	public int getPersonalDetailId() {
		return personalDetailId;
	}
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getGender() {
		return gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
	public String getState() {
		return state;
	}
	public String getEmailId() {
		return emailId;
	}
	public int getMobNumber() {
		return mobNumber;
	}
	public void setPersonalDetailId(int personalDetailId) {
		this.personalDetailId = personalDetailId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}
	
	@Override
	public String toString() {
		return personalDetailId + " " + userId + " " + userName
				+ " " + gender + " " + birthDate + " " + address + " " + city
				+ " " + pincode + " " + state + " " + emailId + " " + mobNumber;
	}
	
	

}
