package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.course;

public interface CourseService {
	
	public List<course> getCourses();
	public course addCourse(course course);
	public course updateCourse(course course);
	
	
	

}
