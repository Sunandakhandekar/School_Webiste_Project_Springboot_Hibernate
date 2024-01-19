package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.HomeworkInformation;

@Repository
public interface HomeworkInfoRepo extends JpaRepository<HomeworkInformation,Integer> {

}
