package study.web.jdbcTempTest;

import java.util.List;

import org.springframework.stereotype.Repository;

public interface StudentDao {

	
	public int addStudent(Student student);
	public int updateStudent();
	public List<Student> findStudent();
	public int deleteStudent();
}
