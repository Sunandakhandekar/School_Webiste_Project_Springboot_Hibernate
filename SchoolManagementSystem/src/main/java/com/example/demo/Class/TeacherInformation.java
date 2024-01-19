package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeacherInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacher_id;
	private String teacher_fname;
	private String teacher_mname;
	private String teacher_lname;
	private String teacher_mobile;
	private String teacher_photo;
	private String email;
	private String teacher_password;
	private String teacher_address;
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}
	public String getTeacher_mname() {
		return teacher_mname;
	}
	public void setTeacher_mname(String teacher_mname) {
		this.teacher_mname = teacher_mname;
	}
	public String getTeacher_lname() {
		return teacher_lname;
	}
	public void setTeacher_lname(String teacher_lname) {
		this.teacher_lname = teacher_lname;
	}
	public String getTeacher_mobile() {
		return teacher_mobile;
	}
	public void setTeacher_mobile(String teacher_mobile) {
		this.teacher_mobile = teacher_mobile;
	}
	public String getTeacher_photo() {
		return teacher_photo;
	}
	public void setTeacher_photo(String teacher_photo) {
		this.teacher_photo = teacher_photo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	public String getTeacher_address() {
		return teacher_address;
	}
	public void setTeacher_address(String teacher_address) {
		this.teacher_address = teacher_address;
	}
	@Override
	public String toString() {
		return "TeacherInformation [teacher_id=" + teacher_id + ", teacher_fname=" + teacher_fname + ", teacher_mname="
				+ teacher_mname + ", teacher_lname=" + teacher_lname + ", teacher_mobile=" + teacher_mobile
				+ ", teacher_photo=" + teacher_photo + ", email=" + email + ", teacher_password=" + teacher_password
				+ ", teacher_address=" + teacher_address + "]";
	}
	
}
