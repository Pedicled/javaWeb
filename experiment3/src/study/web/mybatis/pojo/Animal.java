package study.web.mybatis.pojo;

public class Animal {
	private Integer id;
	private String type;
	private Integer legs;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getLegs() {
		return legs;
	}
	public void setLegs(Integer legs) {
		this.legs = legs;
	}
	
	public String toString(){
		return "Animal [id="+id+",type="+type+",legs="+legs+"]";
	}
}
