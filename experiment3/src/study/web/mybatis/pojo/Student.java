package study.web.mybatis.pojo;


public class Student {
	private Integer stuno;
	private String stuname;
	private String birthday;
	private String gender;
	private Integer score;
	private String speciality;
	
	public Integer getStuno() {
		return stuno;
	}
	public void setStuno(Integer stuno) {
		this.stuno = stuno;
	}
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String toString() {
		return "Student [stuno="+stuno+",stuname="+stuname+",birthday="+birthday+",gender="+gender+",score="+score+",speciality="+speciality+"]";
	}
}
