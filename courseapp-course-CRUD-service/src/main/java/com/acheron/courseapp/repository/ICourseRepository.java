/**
 * 
 */
package com.acheron.courseapp.repository;

import com.acheron.courseapp.model.Course;

/**
 * @author JagannathSutar
 * This interface use to do operation with the data base
 *
 */

public interface ICourseRepository {
	void addCourse(Course course);
	
	void updateCourse(Course course);
	
	void deleteCourse(String courseId);
	
	
	
	
	
}
