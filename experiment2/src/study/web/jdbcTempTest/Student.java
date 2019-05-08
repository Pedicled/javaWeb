package study.web.jdbcTempTest;

public class Student {
	private Integer stuno;
	private String stuname;
	private String birthday;
	private String gender;
	private Double score;
	
	public void setStuno(Integer stuno){
		this.stuno = stuno;
	}
	public void setStuname(String stuname){
		this.stuname = stuname;
	}
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setScore(Double score){
		this.score = score;
	}
	public Integer getStuno(){
		return stuno;
	}
	public String getStuname(){
		return stuname;
	}
	public String getBirthday(){
		return birthday;
	}
	public String getGender(){
		return gender;
	}
	public Double getScore(){
		return score;
	}
	
	public String toString(){
		return "Student ["+"stuno:"+stuno+",stuname:"+stuname+",birthday:"+birthday+",gender:"+gender+",score:"+score;
	}
}
