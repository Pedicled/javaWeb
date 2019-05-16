package study.web.pojo;

public class Student {
    private Integer id;

    private String stuname;

    private Integer stuage;

    private String gender;

    private String department;

    private Integer stuid;
    
    private Stucard card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }
    
    public String toString(){
    	return "Student [id="+id+",stuname="+stuname+",gender="+gender+",stuage="+stuage+",department="+department+",stuid="+stuid+","+card+"]";
    }
}