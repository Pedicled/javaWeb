package study.web.jdbcTempTest;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addStudent(Student student){
		String sql = "insert into student(stuname,birthday,gender,score) value(?,?,?,?)";
		Object[] args = new Object[]{
				student.getStuname(),
				student.getBirthday(),
				student.getGender(),
				student.getScore()
		};
		int num = this.jdbcTemplate.update(sql,args);
		return num;
	}
	public int updateStudent(){
		String sql = "update student set score=377 order by stuno desc limit 1";
		return this.jdbcTemplate.update(sql);
	}
	
	public List<Student> findStudent(){
		String sql = "select * from student where birthday like'____07%%' and gender='Ů'" ;
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	public int deleteStudent(){
		String sql = "delete from student where score>200";
		int i = 1/0;
		return this.jdbcTemplate.update(sql);
	}
}
