package com.springrest.springrest.service;


//import com.springrest.springrest.dao.CourceDao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourceDao;
import com.springrest.springrest.entities.course;
//import com.skilrock.dge.exception.DMSMessages;
import com.springrest.exception.*;

@Service
public class serviceimpl  implements CourseService{
	
       List<course> list;
	@Autowired
	private CourceDao courseDao;
	
	public serviceimpl()
	{
		
		/*	// TODO Auto-generated method stub
	         list =new ArrayList<>();
			 list.add(new course(145,"java","this is course java"));
             list.add(new course(146,"python","this is  phython course"));
			*/ 
	}
	
	
	

	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
	  //  return list;
		 return courseDao.findAll();
		
	}
	
	
	public course getCourse(long courseId)
	{
		
		return courseDao.getOne(courseId);
	}
	
	
	public course addCourse(course course)
	{
		courseDao.save(course);
		return course;
	}
	
	
	public course updateCourse(course course)
	{
		courseDao.save(course);
		return course;
	}

}
