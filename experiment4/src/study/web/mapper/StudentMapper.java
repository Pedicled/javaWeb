package study.web.mapper;

import java.util.List;

import study.web.pojo.Student;

public interface StudentMapper {
	public List<Student> selectStudent(Student student);
}