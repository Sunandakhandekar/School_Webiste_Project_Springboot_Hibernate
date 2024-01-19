package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

private int admin_id;
private String admin_name;
private String admin_email;
private String admin_password;
public int getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(int admin_id) {
	this.admin_id = admin_id;
}
public String getAdmin_name() {
	return admin_name;
}
public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
}
public String getAdmin_email() {
	return admin_email;
}
public void setAdmin_email(String admin_email) {
	this.admin_email = admin_email;
}
public String getAdmin_password() {
	return admin_password;
}
public void setAdmin_password(String admin_password) {
	this.admin_password = admin_password;
}
@Override
public String toString() {
	return "AdminLogin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_email=" + admin_email
			+ ", admin_password=" + admin_password + "]";
}

}
