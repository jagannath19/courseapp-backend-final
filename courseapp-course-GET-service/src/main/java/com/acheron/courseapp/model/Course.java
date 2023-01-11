/**
 * 
 */
package com.acheron.courseapp.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author JagannathSutar
 *
 */
public class Course {
	@JsonProperty("objectID")
	private String courseId;
	
	private String courseName;
	private  String category;
	private String subcategory;
	private List<String> topics;
	private String facultyName;
	private int durationInDays;
	private int totalHour;
	private String status;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate startDate;
	@DateTimeFormat(iso = ISO.DATE) 
	private LocalDate endDate;
	private List<String> languages;

	private List<String> subtitles;
	private List<String> features;
//	Excellent UX/UI. ...
//	Video-based Content. ...
//	Interactive Content. ...
//	Live Tutorials and Sessions. ...
//	Testing Knowledge. ...
//	Multilingual addressed. ...
//	Offline Mode.
	private double price;
	private double rating;
	private String level;
	private String mode;
	public Course() {
		super();
	}
	
	public Course(String courseId, String courseName, String category, String subcategory, List<String> topics,
			String facultyName, int durationInDays, int totalHour, String status, LocalDate startDate,
			LocalDate endDate, List<String> languages, List<String> subtitles, List<String> features, double price,
			double rating, String level, String mode) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.subcategory = subcategory;
		this.topics = topics;
		this.facultyName = facultyName;
		this.durationInDays = durationInDays;
		this.totalHour = totalHour;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.languages = languages;
		this.subtitles = subtitles;
		this.features = features;
		this.price = price;
		this.rating = rating;
		this.level = level;
		this.mode = mode;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}

	public int getTotalHour() {
		return totalHour;
	}

	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getSubtitles() {
		return subtitles;
	}

	public void setSubtitles(List<String> subtitles) {
		this.subtitles = subtitles;
	}

	public List<String> getFeatures() {
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	

}
