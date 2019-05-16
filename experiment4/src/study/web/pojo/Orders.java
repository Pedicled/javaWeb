package study.web.pojo;

public class Orders {
    private Integer id;

    private String number;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    
    public String toString(){
    	return "Orders [id="+id+",number="+number+",userid="+userid+"]";
    }
}