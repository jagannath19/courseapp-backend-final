/**
 * 
 */
package com.acheron.courseapp.service;

import com.acheron.courseapp.model.Course;

/**
 * @author JagannathSutar
 *
 */
public interface ICourseService {
	void addCourse(Course course);
	
	void updateCourse(Course course);
	
	void deleteCourse(String courseId);
	
	
	
	
}
