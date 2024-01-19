package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int video_id;
	private String video_date;
	private String chapter_name;
	private String teacher_fname;
	private String board_name;
	private String subject_name;
	private String class_name;
	private String youtube_link;
	public int getVideo_id() {
		return video_id;
	}
	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}
	public String getVideo_date() {
		return video_date;
	}
	public void setVideo_date(String video_date) {
		this.video_date = video_date;
	}
	public String getChapter_name() {
		return chapter_name;
	}
	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
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
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getYoutube_link() {
		return youtube_link;
	}
	public void setYoutube_link(String youtube_link) {
		this.youtube_link = youtube_link;
	}
	@Override
	public String toString() {
		return "VideoInformation [video_id=" + video_id + ", video_date=" + video_date + ", chapter_name="
				+ chapter_name + ", teacher_fname=" + teacher_fname + ", board_name=" + board_name + ", subject_name="
				+ subject_name + ", class_name=" + class_name + ", youtube_link=" + youtube_link + "]";
	}
	
	
}
