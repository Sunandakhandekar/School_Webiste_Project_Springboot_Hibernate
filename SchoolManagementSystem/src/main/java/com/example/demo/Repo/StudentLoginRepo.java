package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.StudentInformation;

@Repository
public interface StudentLoginRepo extends JpaRepository<StudentInformation,Integer>  {
	  public StudentInformation findBysemail(String email);

}
