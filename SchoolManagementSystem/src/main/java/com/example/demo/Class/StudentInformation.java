package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentInformation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_id;
	private String student_fname;
	private String student_mnane;
	private String student_lname;
	private String student_mobile;
	private String student_photo;
	private String student_address;
	private String semail;
	private String student_password;
	private String board_name;
	private String batch_name;
	private String class_name;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_fname() {
		return student_fname;
	}
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	public String getStudent_mnane() {
		return student_mnane;
	}
	public void setStudent_mnane(String student_mnane) {
		this.student_mnane = student_mnane;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	public String getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_photo() {
		return student_photo;
	}
	public void setStudent_photo(String student_photo) {
		this.student_photo = student_photo;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	@Override
	public String toString() {
		return "StudentInformation [student_id=" + student_id + ", student_fname=" + student_fname + ", student_mnane="
				+ student_mnane + ", student_lname=" + student_lname + ", student_mobile=" + student_mobile
				+ ", student_photo=" + student_photo + ", student_address=" + student_address + ", semail=" + semail
				+ ", student_password=" + student_password + ", board_name=" + board_name + ", batch_name=" + batch_name
				+ ", class_name=" + class_name + "]";
	}
	
} 

