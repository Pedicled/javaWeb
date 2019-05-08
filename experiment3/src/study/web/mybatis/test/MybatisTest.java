package study.web.mybatis.test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import study.web.mybatis.mapper.AMapper;
import study.web.mybatis.pojo.Animal;
import study.web.mybatis.pojo.Student;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisTest {
	private SqlSessionUtil ssu = new SqlSessionUtil();
	private SqlSession ss = ssu.getSqlSession();

	
	@Test
	public void allAnimal(){
		AMapper ad = (AMapper) ss.getMapper(AMapper.class);
		List<Animal> animal = ad.allAnimal();
		for(Animal a:animal){
			System.out.println(a.toString());
		}
		ss.close();
	}
	
	@Test
	public void findAnimalByLegs(){
		int legs=4;
		List<Animal> animal = ss.selectList("study.web.mybatis.mapper.AnimalMapper.findAnimalByLegs",legs);
		for(Animal a:animal){
			System.out.println(animal.toString());
		}
		ss.close();
	}
	
	@Test
	public void findStudentByStuno(){
		int stuno = 1;
		Student student = ss.selectOne("study.web.mybatis.mapper.StudentMapper.findStudentByStuno",stuno);
		System.out.println(student.toString());
		ss.close();
	}
	@Test
	public void findStudentBySpeciality(){
		String speciality = "软件";
		List<Student> students = ss.selectList("study.web.mybatis.mapper.StudentMapper.findStudentBySpeciality",speciality);
		for(Student stu:students){
			System.out.println(stu.toString());
		}
		ss.close();
	}
	@Test
	public void addStudent(){
		Student student = new Student();
		student.setStuname("张大胆");
		student.setBirthday("19960506");
		student.setGender("男");
		student.setScore(200);
		student.setSpeciality("软件");
		int num = ss.insert("study.web.mybatis.mapper.StudentMapper.addStudent",student);
		ss.commit();
		System.out.println("成功插入"+num+"条数据!");
		ss.close();
	}
	@Test
	public void updateStudent(){
		Student student = new Student();
		student.setStuno(2);
		student.setStuname("李不怕");
		student.setSpeciality("人工智能");
		int num = ss.update("study.web.mybatis.mapper.StudentMapper.updateStudentByStuno",student);
		ss.commit();
		System.out.println("成功修改"+num+"条数据!");
		ss.close();
	}
	
	@Test
	public void deleteStudent(){
		String stuname="张大胆";
		int num = ss.delete("study.web.mybatis.mapper.StudentMapper.deleteStudent",stuname);
		ss.commit();
		System.out.println("成功删除"+num+"条数据!");
		ss.close();
	}
}
