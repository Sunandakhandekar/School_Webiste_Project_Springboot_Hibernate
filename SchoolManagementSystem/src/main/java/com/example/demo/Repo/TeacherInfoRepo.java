package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.TeacherInformation;



@Repository
public interface TeacherInfoRepo extends JpaRepository<TeacherInformation,Integer> {
  
}
