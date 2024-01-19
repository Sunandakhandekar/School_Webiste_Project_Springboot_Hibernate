package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeworkInformation {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)


	private int homework_id;
	private String homwork_date;
	 private String homework_chapter;
	private String pdf;
	private String teacher_fname;
	private String class_name;
	private String board_name;
	private String subject_name;
	public int getHomework_id() {
		return homework_id;
	}
	public void setHomework_id(int homework_id) {
		this.homework_id = homework_id;
	}
	public String getHomwork_date() {
		return homwork_date;
	}
	public void setHomwork_date(String homwork_date) {
		this.homwork_date = homwork_date;
	}
	public String getHomework_chapter() {
		return homework_chapter;
	}
	public void setHomework_chapter(String homework_chapter) {
		this.homework_chapter = homework_chapter;
	}
	public String getPdf() {
		return pdf;
	}
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	@Override
	public String toString() {
		return "HomeworkInformation [homework_id=" + homework_id + ", homwork_date=" + homwork_date
				+ ", homework_chapter=" + homework_chapter + ", pdf=" + pdf + ", teacher_fname=" + teacher_fname
				+ ", class_name=" + class_name + ", board_name=" + board_name + ", subject_name=" + subject_name + "]";
	}
	
	
}
