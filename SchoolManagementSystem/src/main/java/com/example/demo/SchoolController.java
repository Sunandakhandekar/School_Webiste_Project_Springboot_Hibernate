package com.example.demo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
import com.example.demo.Service.SchoolService;

@Controller
public class SchoolController 
{
	@Autowired
		SchoolService ss;

		/*** index page Mapping ***/

		@GetMapping("/")
		public String index(ModelMap m) 
		{
			long boardNumber = ss.totalboardNumber();
			long batchNumber =ss.totalbatchNumber();
			long classNumber =ss.totalclassNumber();
			long subjectNumber = ss.totalsubjectNumber();
			long teacherNumber= ss.totalteacherNumber();
			long studentNumber= ss.totalstudentNumber();
			long videoNumber= ss.totalvideoNumber();
			long homeworkNumber= ss.totalhomeworkNumber();
			
			m.addAttribute("boardNumber", boardNumber);
			m.addAttribute("batchNumber", batchNumber);
			m.addAttribute("classNumber", classNumber);
			m.addAttribute("subjectNumber", subjectNumber);
			m.addAttribute("teacherNumber", teacherNumber);
			m.addAttribute("studentNumber", studentNumber);
			m.addAttribute("videoNumber", videoNumber);
			m.addAttribute("homeworkNumber", homeworkNumber);


			return "index";
		}

		@GetMapping("home")
		public String home() {
			return "home";
		}
		@GetMapping("admin_login")
		
			public String admin_login()
			{
				return "admin_login";
			}
		
		

		@PostMapping("login")
		public String login_data(ModelMap m,@RequestParam("admin_email") String email,@RequestParam("admin_password")String password)
		{
				if(email.equals("admin@gmail.com") && password.equals("admin"))
				{
					return "redirect:/";
				}
				else
				{
					return "redirect:/admin_login";
				}
		}

		@GetMapping("register")
		public String register() {
			return "/";
		}

		/*** Board Master page Mapping ***/
		@GetMapping("boardMaster")
		public String boardMaster(ModelMap m) { 
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			return "boardMaster";
		}

		@PostMapping("board_master")
		public String boardmaster(@ModelAttribute("b1") BoardMaster b1) {
			ss.saved(b1);
			
			return "redirect:/boardMaster";
		}

		@GetMapping("addBoard")
		public String addBoard() {
			return "addBoard";
		}
		@GetMapping("delBoard")
		public String delete(@RequestParam("id")int id)
		{
			ss.deletedata(id);
			return "redirect:/boardMaster";
		}
		@GetMapping("editBoard")
		public String edit(@RequestParam("id")int id,ModelMap m)
		{
			BoardMaster B=ss.editdata(id);
			m.addAttribute("e",B);
			return "editBoard";
		}	
		@PostMapping("update_board_master")
		public String update_board_master(@ModelAttribute("b1") BoardMaster b1) {
			ss.saved(b1);
			return "redirect:/boardMaster";
		}

										/*** Batch Master page Mapping ***/

		@GetMapping("batchMaster")
		public String batchMaster() {
			return "batchMaster";
		}
		@PostMapping("batch_master")
		public String batch_master(@ModelAttribute("c1") BatchMaster c1) {
			ss.saved(c1);
			return "redirect:/addBatch";
		}

		@GetMapping("addBatch")
		public String addBatch(ModelMap m) { 
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			return "addBatch";
		}
		@GetMapping("delBatch")
		public String delete3(@RequestParam("id")int id)
		{
			ss.batchdeletedata(id);
			return "redirect:/addBatch";
		}
		@GetMapping("editBatch")
		public String edit3(@RequestParam("id")int id,ModelMap m)
		{
			BatchMaster B=ss.batcheditdata(id);
			m.addAttribute("e",B);
			return "editBatch";
		}	
		@PostMapping("update_batch_master")
		public String update_batch_master(@ModelAttribute("c1") BatchMaster c1) {
			ss.saved(c1);
			return "redirect:/addClass";
		}

		
		

		/*** Class Master page Mapping ***/

		@GetMapping("classMaster")
		public String classMaster() {
			return "classMaster";
		}
		@PostMapping("class_master")
		public String class_master(@ModelAttribute("c1") ClassMaster a1) {
			ss.saved(a1);
			return "redirect:/addClass";
		}

		@GetMapping("addClass")
		public String addClass(ModelMap m) { 
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			return "addClass";
		}
		
		@GetMapping("delClass")
		public String delete1(@RequestParam("id")int id)
		{
			ss.classdeletedata(id);
			return "redirect:/addClass";
		}
		@GetMapping("editClass")
		public String edit1(@RequestParam("id")int id,ModelMap m)
		{
			ClassMaster C=ss.classeditdata(id);
			m.addAttribute("e",C);
			return "editClass";
		}	

		@PostMapping("update_class_master")
		public String update_class_master(@ModelAttribute("a1") ClassMaster a1) {
			ss.saved(a1);
			return "redirect:/addClass";
		}
		
		/*** Subject Master page Mapping ***/
		@GetMapping("subjectMaster")
		public String subjectMaster() {
			return "subjectMaster";
		}
		
		@PostMapping("subject_master")
		public String subject_master(@ModelAttribute("c1") SubjectMaster d1) {
			ss.saved(d1);
			return "redirect:/addSubject";
		}


		@GetMapping("addSubject")
		public String addSubject(ModelMap m) { 
			List<SubjectMaster> d1=ss.subjectdisplaydata();
			m.addAttribute("d1", d1);
			return "addSubject";
		}
		@GetMapping("delSubject")
		public String delete2(@RequestParam("id")int id)
		{
			ss.subjectdeletedata(id);
			return "redirect:/addSubject";
		}
		@GetMapping("editSubject")
		public String edit2(@RequestParam("id")int id,ModelMap m)
		{
			SubjectMaster C=ss.subjecteditdata(id);
			m.addAttribute("e",C);
			return "editSubject";
		}	
		@PostMapping("update_subject_master")
		public String update_subject_master(@ModelAttribute("d1") SubjectMaster d1) {
			ss.saved(d1);
			return "redirect:/addSubject";
		}
		

		/*** Teacher page Mapping ***/

		@GetMapping("teacherform")
		public String teacherform() {
			return "teacherform";
		}
		
		@PostMapping("teacher_form")
		public String teacher_form(@RequestParam("filename") MultipartFile teacher_photo, @ModelAttribute("s") TeacherInformation s )
		{
		    String path2="src/main/resources/static/sunanda/";
			String filename=null;	 
			 try {
				filename = this.ss.UploadImage(path2, teacher_photo);
			} 
			 catch (IOException e) {
				
				e.printStackTrace();
			}
			
		        s.setTeacher_photo(filename);
			ss.saved(s);
			return "redirect:/teacherInfo";
		}
		@GetMapping("teacherInfo")
		public String teacherInfo(ModelMap m) { 
			List<TeacherInformation> t1=ss.teacherdisplaydata();
			m.addAttribute("t1", t1);
			return "teacherInfo";
		}
		@GetMapping("delTeacher")
		public String delete4(@RequestParam("id")int id)
		{
			ss.teacherdeletedata(id);
			return "redirect:/teacherInfo";
		}
		@GetMapping("editTeacher")
		public String edit4(@RequestParam("id")int id,ModelMap m)
		{
			TeacherInformation C=ss.teachereditdata(id);
			m.addAttribute("e",C);
			return "editTeacher";
		}	
		
		@PostMapping("update_teacher_info")
		public String update_teacher_info(@ModelAttribute("t1") TeacherInformation t1) {
			ss.saved(t1);
			return "redirect:/teacherInfo";
		}
		
		/*** Student page Mapping ***/
		
		@GetMapping("studentform")
		public String studentform(ModelMap m) {
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			return "studentform";
		} 
		@PostMapping("student_form")
		public String student_form(@RequestParam("filename") MultipartFile student_photo, @ModelAttribute("s") StudentInformation s )
		{
		    String path1="src/main/resources/static/shriyu/";
			String filename=null;	 
			 try {
				filename = this.ss.UploadImage(path1, student_photo);
			} 
			 catch (IOException e) {
				
				e.printStackTrace();
			}
			
		        s.setStudent_photo(filename);
			ss.saved(s);
			return "redirect:/studentInfo";
		}
		
		@GetMapping("studentInfo")
		public String studentInfo(ModelMap m) { 
			List<StudentInformation> s1=ss.studentdisplaydata();
			m.addAttribute("s1", s1);
			
			return "studentInfo";
		}
		@GetMapping("delStudent")
		public String delete5(@RequestParam("id")int id)
		{
			ss.studentdeletedata(id);
			return "redirect:/studentInfo";
		}
		@GetMapping("editStudent")
		public String edit5(@RequestParam("id")int id,ModelMap m)
		{
			StudentInformation S=ss.studenteditdata(id);
			m.addAttribute("e",S);
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			return "editStudent";
		}	
		
		@PostMapping("update_student_info")
		public String update_student_info(@ModelAttribute("t1") StudentInformation t1) {
			ss.saved(t1);
			return "redirect:/studentInfo";
		}
		
		
									/*** Video page Mapping ***/
		
		@GetMapping("Videoform")
		public String Videoform(ModelMap m) {
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			List<TeacherInformation> t1=ss.teacherdisplaydata();
			m.addAttribute("t1", t1);
			List<SubjectMaster> d1=ss.subjectdisplaydata();
			m.addAttribute("d1", d1);
			return "Videoform";
		}
		
		@PostMapping("video_form")
		public String video_form(@ModelAttribute("v1") VideoInformation v1) {		
			ss.saved(v1);
			return "redirect:/videoInfo";
		}
		
		@GetMapping("videoInfo")
		public String videoInfo(ModelMap m) { 
			List<VideoInformation> v1=ss.videodisplaydata();
			m.addAttribute("v1", v1);
			
			return "videoInfo";
		}
		@GetMapping("delVideo")
		public String delete6(@RequestParam("id")int id)
		{
			ss.videodeletedata(id);
			return "redirect:/videoInfo";
		}
		
		@GetMapping("editVideo")
		public String edit6(@RequestParam("id")int id,ModelMap m)
		{
			VideoInformation S=ss.videoeditdata(id);
			m.addAttribute("e",S);
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			List<TeacherInformation> t1=ss.teacherdisplaydata();
			m.addAttribute("t1", t1);
			List<SubjectMaster> d1=ss.subjectdisplaydata();
			m.addAttribute("d1", d1);

			return "editVideo";
		}	
		@PostMapping("update_video_info")
		public String update_video_info(@ModelAttribute("t1") VideoInformation t1) {
			ss.saved(t1);
			return "redirect:/videoInfo";
		}
		

		/*** Homework page Mapping ***/

		@GetMapping("homeworkInfo")
		public String homeworkInfo(ModelMap m) { 
			List<HomeworkInformation> h1=ss.homeworkdisplaydata();
			m.addAttribute("h1", h1);
			
			
			return "homeworkInfo";
		}
		@PostMapping("homework_form")
		public String homework_form(@ModelAttribute("h1") HomeworkInformation h1) {
			ss.saved(h1);
			return "redirect:/homeworkInfo";
		}

		@GetMapping("homeworkform")
		public String homeworkform(ModelMap m) {
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			List<TeacherInformation> t1=ss.teacherdisplaydata();
			m.addAttribute("t1", t1);
			List<SubjectMaster> d1=ss.subjectdisplaydata();
			m.addAttribute("d1", d1);
			return "homeworkform";
		}
		@GetMapping("delHomework")
		public String delete7(@RequestParam("id")int id)
		{
			ss.homeworkdeletedata(id);
			return "redirect:/homeworkInfo";
		}
		
		@GetMapping("editHomework")
		public String edit7(@RequestParam("id")int id,ModelMap m)
		{
			HomeworkInformation S=ss.homeworkeditdata(id);
			m.addAttribute("e",S);
			List<BoardMaster> b1=ss.displaydata();
			m.addAttribute("b1", b1);
			List<BatchMaster> c1=ss.batchdisplaydata();
			m.addAttribute("c1", c1);
			List<ClassMaster> a1=ss.classdisplaydata();
			m.addAttribute("a1", a1);
			List<TeacherInformation> t1=ss.teacherdisplaydata();
			m.addAttribute("t1", t1);
			List<SubjectMaster> d1=ss.subjectdisplaydata();
			m.addAttribute("d1", d1);
			return "editHomework";
		}	
		@PostMapping("update_homework_info")
		public String update_home_info(@ModelAttribute("h1") HomeworkInformation h1) {
			ss.saved(h1);
			return "redirect:/homeworkInfo";
		}
		/**Teacher Dashboard**/
		
@GetMapping("TeacherLogin")
		
		public String TeacherLogin()
		{
			return "TeacherLogin";
		}
@PostMapping("teacher_login")
public String teacher_login(@RequestParam("email") String email, @RequestParam("teacher_password") String teacher_password)
{
	try {
		TeacherInformation t1= ss.getTeacher_login(email, teacher_password);
		if(t1!=null)
		{
			return "redirect:/TeacherDashboard";
		}
	}
	catch(Exception e)
	{
		// TODO: handle exception
		e.printStackTrace();
	}
	return "redirect:/TeacherLogin";
	
}
		@GetMapping("TeacherDashboard")
		public String TeacherDashboard(ModelMap m)
		{
			List<StudentInformation> s1=ss.studentdisplaydata();
			m.addAttribute("s1", s1);
			return "TeacherDashboard";
		}
		
		@GetMapping("TeacherVideoUpload")
		public String TeacherVideoUpload(ModelMap m)
		{
			List<VideoInformation> v1=ss.videodisplaydata();
			m.addAttribute("v1", v1);
			return "TeacherVideoUpload";
		}
		@GetMapping("TeacherHomeworkUpload")
		public String TeacherHomeworkUpload(ModelMap m)
		{
			List<HomeworkInformation> h1=ss.homeworkdisplaydata();
			m.addAttribute("h1", h1);
			return "TeacherHomeworkUpload";
		}
		
		/**Student Dashboard****/
@GetMapping("StudentLogin")
		
		public String StudentLogin(ModelMap m)
		{
	List<StudentInformation> s1=ss.studentdisplaydata();
	m.addAttribute("s1", s1);
			return "StudentLogin";
		}
@PostMapping("student_login")
public String student_login(@RequestParam("semail") String semail,@RequestParam("student_password")String student_password)
{
	try {
		StudentInformation t1= ss.getStudent_login(semail, student_password);
		if(t1!=null)
		{
			return "redirect:/StudentDashboard";
		}
	}
	catch(Exception e)
	{
		// TODO: handle exception
		e.printStackTrace();
	}
	return "redirect:/StudentLogin";
	
}
		@GetMapping("StudentDashboard")
		public String StudentDashboard(ModelMap m)
		{
			List<VideoInformation> v1=ss.videodisplaydata();
			m.addAttribute("v1", v1);
			return "StudentDashboard"; 
		}                          
		
@GetMapping("StudentHomeworkUpload")
		
		public String StudentHomeworkUpload(ModelMap m)
		{
	List<HomeworkInformation> h1=ss.homeworkdisplaydata();
	m.addAttribute("h1", h1);
	List<BoardMaster> b1=ss.displaydata();
	m.addAttribute("b1", b1);
	List<BatchMaster> c1=ss.batchdisplaydata();
	m.addAttribute("c1", c1);
	List<ClassMaster> a1=ss.classdisplaydata();
	m.addAttribute("a1", a1);
	List<TeacherInformation> t1=ss.teacherdisplaydata();
	m.addAttribute("t1", t1);
	List<SubjectMaster> d1=ss.subjectdisplaydata();
	m.addAttribute("d1", d1);
			return "StudentHomeworkUpload";
		}
@PostMapping("student_homework_form")
public String student_homework_form(@ModelAttribute("h1") HomeworkInformation h1, ModelMap m)
{

	
	ss.saved(h1);
	return"redirect:/TeacherHomeworkUpload";
}
		
@GetMapping("profile")
public String profile()
{
	return "profile";
}
}
