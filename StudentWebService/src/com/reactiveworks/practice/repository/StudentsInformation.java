package com.reactiveworks.practice.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.practice.model.Student;


public class StudentsInformation {

	List<Student> students = new ArrayList<Student>();

	public List<Student> getStudents() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;

		date = sdf.parse("1999-07-26");
		students.add(new Student("asha", 1, date, 67.8));
		date = sdf.parse("1999-09-26");
		students.add(new Student("akbar", 2, date, 70));
		date = sdf.parse("1999-10-26");
		students.add(new Student("amrita", 3, date, 69));
		date = sdf.parse("1999-11-26");
		students.add(new Student("arti", 4, date, 55));
		date = sdf.parse("1999-12-26");
		students.add(new Student("amay", 5, date, 77));
		
		return students;

	}
	
	public void insertStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(int rollNo) {
		for(Student obj:students) {
			if(obj.getRollNo()==rollNo) {
				students.remove(obj);
			}
		}
	}

}
