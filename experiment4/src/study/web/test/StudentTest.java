package study.web.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import study.web.pojo.Student;
import study.web.utils.MybatisUtils;

public class StudentTest {
	private SqlSession ss = MybatisUtils.getSession();
	@Test
	public void selectStudent(){
		Student stu1 = new Student();
		stu1.setDepartment("���");
		stu1.setStuname("jack");
		Student stu = ss.selectOne("study.web.mapping.StudentMapper.selectStudent",stu1);
		System.out.println(stu);
		ss.close();
	}
	@Test
	public void updateStudentById(){
		Student stu1 = new Student();
		stu1.setStuname("marrie");
		stu1.setGender("Ů");
		stu1.setStuage(20);
		stu1.setDepartment("԰��");
		stu1.setId(1);
		int num = ss.update("study.web.mapping.StudentMapper.updateStudentById",stu1);
		ss.commit();
		if(num>0)
			System.out.println("�ɹ��޸���"+num+"����¼");
		else
			System.out.println("ʧ��");
		ss.close();
	}
	@Test
	public void selectStudentByIds(){
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		List<Student> students = ss.selectList("study.web.mapping.StudentMapper.selectStudentByIds",ids);
		for(Student stu:students)
			System.out.println(stu);
		ss.close();
	}
	@Test
	public void findStudentStuno(){
		Student student = ss.selectOne("study.web.mapping.StudentMapper.findStudentStuno",2);
		System.out.println(student);
		ss.close();
	}
}
