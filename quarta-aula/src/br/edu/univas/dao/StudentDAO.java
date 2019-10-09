package br.edu.univas.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Student;

public class StudentDAO {

	private static List<Student> studentData;
	
	public StudentDAO() {
		studentData = new ArrayList<Student>();
	}
	
	public void save(Student student) {
		studentData.add(student);
	}
	
	public List<Student> getAll() {
		return studentData;
	}
}
