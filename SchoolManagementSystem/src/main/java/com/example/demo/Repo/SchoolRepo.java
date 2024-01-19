package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.BoardMaster;

@Repository
public interface SchoolRepo extends JpaRepository<BoardMaster,Integer> {


}
