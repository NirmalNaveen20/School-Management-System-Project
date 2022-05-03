package com.staff;


public class Staff {
	private String id;
	private String name;
	private String academic;
	private String subject;
	private String email;
	private String number;
	private String dateofBirth;
	private String gender;
	
	public Staff(String id, String name, String academic, String subject, String email, String contactNumber, String dateofBirth, String gender) {
		this.id = id;
		this.name = name;
		this.academic = academic;
		this.subject = subject;
		this.email = email;
		this.number = number;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getacademic() {
		return academic;
	}
	
	public void setacademic(String academic) {
		this.academic = academic;
	}
	
	public String getsubject() {
		return subject;
	}
	
	public void setsubject(String subject) {
		this.subject = subject;
	}

	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}

	public String getnumber() {
		return number;
	}
	
	public void setnumber(String number) {
		this.number = number;
	}

	public String getdateofBirth() {
		return dateofBirth;
	}
	
	public void setdateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getgender() {
		return gender;
	}
	
	public void setgender(String gender) {
		this.gender = gender;
	}

	

}
