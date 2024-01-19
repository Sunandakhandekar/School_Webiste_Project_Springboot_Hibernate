package com.example.demo.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Class.AdminLogin;
import com.example.demo.Class.BatchMaster;
import com.example.demo.Class.BoardMaster;
import com.example.demo.Class.ClassMaster;
import com.example.demo.Class.HomeworkInformation;
import com.example.demo.Class.StudentInformation;
import com.example.demo.Class.SubjectMaster;
import com.example.demo.Class.TeacherInformation;
import com.example.demo.Class.VideoInformation;

public interface SchoolService {
	/*** Admin Login Services ***/
	
	void saved(AdminLogin a);
	
	/*** Board Master Services ***/
	 void saved(BoardMaster b);
	 
	List<BoardMaster> displaydata();
	
	void deletedata(int id);
	
	BoardMaster editdata(int id);
	
	long totalboardNumber();
	
	
					/*** Batch Master Services ***/
	
	void saved(BatchMaster m);
	
	List<BatchMaster> batchdisplaydata();
 
 
	void batchdeletedata(int id);
 
	BatchMaster batcheditdata(int id);
	
	long totalbatchNumber();
 
						/*** Class Master Services ***/
	
	void saved(ClassMaster c);
	
	List<ClassMaster> classdisplaydata();
	
	void classdeletedata(int id);
	
	ClassMaster classeditdata(int id);
	
	long totalclassNumber();
	
 
					/*** Subject  Master Services ***/
	void saved(SubjectMaster s);
	
	List<SubjectMaster> subjectdisplaydata();
	
	void subjectdeletedata(int id);
	
	SubjectMaster subjecteditdata(int id);
	
	long totalsubjectNumber();
	
	

	/*** Teacher Info Services ***/
		void saved(TeacherInformation t);
		
		List<TeacherInformation> teacherdisplaydata();
		
		void teacherdeletedata(int id);
		
		TeacherInformation teachereditdata(int id);
		
		long totalteacherNumber();
		
		TeacherInformation getTeacher_login(String email, String teacher_password);
		
		/*** Student Info Services ***/
		
		void saved(StudentInformation s);
		
		List<StudentInformation> studentdisplaydata();
		
		void studentdeletedata(int id);
		
		StudentInformation studenteditdata(int id);
		
		long totalstudentNumber();
		
		String UploadImage(String path, MultipartFile file) throws IOException;
		
		StudentInformation getStudent_login(String semail, String teacher_password);


		/*** Video Services ***/
		
		
		void saved(VideoInformation v);
		
		List<VideoInformation> videodisplaydata();
		
		void videodeletedata(int id);
		
		VideoInformation videoeditdata(int id);
		
		long totalvideoNumber();
		
		/*** Homework Services ***/

		void saved(HomeworkInformation h);
		
		List<HomeworkInformation> homeworkdisplaydata();
		
		void homeworkdeletedata(int id);
		
		HomeworkInformation homeworkeditdata(int id);
		
		long totalhomeworkNumber();
		
		
		/*******Student Login*********/
		
		
		
		
}
