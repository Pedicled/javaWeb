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
		String speciality = "���";
		List<Student> students = ss.selectList("study.web.mybatis.mapper.StudentMapper.findStudentBySpeciality",speciality);
		for(Student stu:students){
			System.out.println(stu.toString());
		}
		ss.close();
	}
	@Test
	public void addStudent(){
		Student student = new Student();
		student.setStuname("�Ŵ�");
		student.setBirthday("19960506");
		student.setGender("��");
		student.setScore(200);
		student.setSpeciality("���");
		int num = ss.insert("study.web.mybatis.mapper.StudentMapper.addStudent",student);
		ss.commit();
		System.out.println("�ɹ�����"+num+"������!");
		ss.close();
	}
	@Test
	public void updateStudent(){
		Student student = new Student();
		student.setStuno(2);
		student.setStuname("���");
		student.setSpeciality("�˹�����");
		int num = ss.update("study.web.mybatis.mapper.StudentMapper.updateStudentByStuno",student);
		ss.commit();
		System.out.println("�ɹ��޸�"+num+"������!");
		ss.close();
	}
	
	@Test
	public void deleteStudent(){
		String stuname="�Ŵ�";
		int num = ss.delete("study.web.mybatis.mapper.StudentMapper.deleteStudent",stuname);
		ss.commit();
		System.out.println("�ɹ�ɾ��"+num+"������!");
		ss.close();
	}
}
