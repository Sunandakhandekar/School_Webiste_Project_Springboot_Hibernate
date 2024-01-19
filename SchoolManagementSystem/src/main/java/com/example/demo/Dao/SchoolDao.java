package com.example.demo.Dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import com.example.demo.Repo.AdminLoginRepo;
import com.example.demo.Repo.BatchMasterRepo;
import com.example.demo.Repo.ClassMasterRepo;
import com.example.demo.Repo.HomeworkInfoRepo;
import com.example.demo.Repo.SchoolRepo;
import com.example.demo.Repo.StudentInfoRepo;
import com.example.demo.Repo.StudentLoginRepo;
import com.example.demo.Repo.SubjectMasterRepo;
import com.example.demo.Repo.TeacherInfoRepo;
import com.example.demo.Repo.TeacherLoginRepo;
import com.example.demo.Repo.VideoInfoRepo;
import com.example.demo.Service.SchoolService;

@Service
public class SchoolDao implements SchoolService {
	@Autowired
	AdminLoginRepo alr;
	
	@Autowired
	SchoolRepo sr;

	@Autowired
	BatchMasterRepo bmr;

	@Autowired
	ClassMasterRepo cmr;

	@Autowired
	SubjectMasterRepo smr;

	@Autowired
	TeacherInfoRepo tir;
	
	@Autowired
	TeacherLoginRepo tlr;
	
	@Autowired
	StudentInfoRepo sir;
	
	@Autowired
	StudentLoginRepo slr;
	
	@Autowired
	VideoInfoRepo vir;
	
	@Autowired
	HomeworkInfoRepo hir;
										/*** Board Master ***/
	@Override
	public void saved(BoardMaster b) {
		sr.save(b);
		

	}

	@Override
	public List<BoardMaster> displaydata() {
		return sr.findAll();
	}

	@Override
	public void deletedata(int id) {
		sr.deleteById(id);
	}

	@Override
	public BoardMaster editdata(int id) {
		BoardMaster b = sr.getById(id);
		return b;
	}
	@Override
	public long totalboardNumber() {
		
		return sr.count();
	}

	
	
											/*** Batch Master ***/

	@Override
	public void saved(BatchMaster m) {
		bmr.save(m);
	}

	@Override
	public List<BatchMaster> batchdisplaydata() {
		// TODO Auto-generated method stub
		return bmr.findAll();
	}

	@Override
	public void batchdeletedata(int id) {
		bmr.deleteById(id);
	}

	@Override
	public BatchMaster batcheditdata(int id) {
		BatchMaster b = bmr.getById(id);
		return b;
	}
	@Override
	public long totalbatchNumber() {
		
		return bmr.count();
	}




											/*** Class Master ***/

	@Override
	public void saved(ClassMaster c) {
		cmr.save(c);
	}

	@Override
	public List<ClassMaster> classdisplaydata() {
		// TODO Auto-generated method stub
		return cmr.findAll();
	}

	@Override
	public void classdeletedata(int id) {
		// TODO Auto-generated method stub
		cmr.deleteById(id);
	}

	@Override
	public ClassMaster classeditdata(int id) {
		ClassMaster c = cmr.getById(id);
		return c;
	}

	@Override
	public long totalclassNumber() {
		// TODO Auto-generated method stub
		return cmr.count();
	}

													/*** Subject Master ***/

	@Override
	public void saved(SubjectMaster s) {
		smr.save(s);
	}

	@Override
	public List<SubjectMaster> subjectdisplaydata() {
		// TODO Auto-generated method stub
		return smr.findAll();
	}

	@Override
	public void subjectdeletedata(int id) {
		// TODO Auto-generated method stub
		smr.deleteById(id);
	}

	@Override
	public SubjectMaster subjecteditdata(int id) {
		SubjectMaster s = smr.getById(id);
		return s;
	}
	@Override
	public long totalsubjectNumber() {
		// TODO Auto-generated method stub
		return smr.count();
	}

	
												/*** Teacher Info ***/
	
	@Override
	public void saved(TeacherInformation t) {
		tir.save(t);
	}

	@Override
	public List<TeacherInformation> teacherdisplaydata() {
		// TODO Auto-generated method stub
		return tir.findAll();
	}

	@Override
	public void teacherdeletedata(int id) {
		// TODO Auto-generated method stub
		tir.deleteById(id);
	}

	@Override
	public TeacherInformation teachereditdata(int id) {
		TeacherInformation t=tir.getById(id);
		return t;
	}
	
	@Override
	public long totalteacherNumber() {
		// TODO Auto-generated method stub
		return tir.count();
	}

													/*** Student  Info ***/

	@Override
	public void saved(StudentInformation s) {
		sir.save(s);
	}

	@Override
	public List<StudentInformation> studentdisplaydata() {
		return sir.findAll();
	}

	@Override
	public void studentdeletedata(int id) {
		sir.deleteById(id);
	}

	@Override
	public StudentInformation studenteditdata(int id) {
		StudentInformation s=sir.getById(id);
		return s;
	}
	
	@Override
	public long totalstudentNumber() {
		// TODO Auto-generated method stub
		return sir.count();
	}



	
	

	
															/*** Video  Info ***/
	
	@Override
	public void saved(VideoInformation v) {
		vir.save(v);
	}

	@Override
	public List<VideoInformation> videodisplaydata() {
		
		return vir.findAll();
	}

	@Override
	public void videodeletedata(int id) {
		vir.deleteById(id);
	}

	@Override
	public VideoInformation videoeditdata(int id) {
		VideoInformation v=vir.getById(id);
		return v;
	}


	@Override
	public long totalvideoNumber() {
		// TODO Auto-generated method stub
		return vir.count();
	}

	
	
																/*** Homework  Info ***/
	@Override
	public void saved(HomeworkInformation h) {
		hir.save(h);
	}

	@Override
	public List<HomeworkInformation> homeworkdisplaydata() {
		return hir.findAll();
	}

	@Override
	public void homeworkdeletedata(int id) {
		hir.deleteById(id);
	}

	@Override
	public HomeworkInformation homeworkeditdata(int id) {
		HomeworkInformation h=hir.getById(id);
		return h;
	}
	@Override
	public long totalhomeworkNumber() {
		// TODO Auto-generated method stub
		return hir.count();
	}

													/*** Admin Login ***/
	
	@Override
	public void saved(AdminLogin a) {
		alr.save(a);
		
	}
/***File Uploading***/
	@Override
	public String UploadImage(String path, MultipartFile file) throws IOException {
		String filename=file.getOriginalFilename();			
		String randomID= UUID.randomUUID().toString();
		String fileName2=randomID.concat(filename.substring(filename.lastIndexOf(".")));		
		String filepath=path+File.separator+fileName2;				
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}			                                                          	
		Files.copy(file.getInputStream(),Paths.get(filepath));
		return fileName2;
	}

	/*********Teacher Login *************/
@Override
public TeacherInformation getTeacher_login(String email, String teacher_password) {
	TeacherInformation tI = tlr.findByemail(email);
	if(tI == null || !tI.getTeacher_password().equals(teacher_password))
	{
		throw new IllegalArgumentException("Invalid");
	}
	return tI;
}





	/*********Student Login *************/

@Override
public StudentInformation getStudent_login(String semail, String student_password) {
	StudentInformation sI = slr.findBysemail(semail);
	if(sI == null || !sI.getStudent_password().equals(student_password))
	{
		throw new IllegalArgumentException("Invalid");
	}
	return sI;
}


												

}
