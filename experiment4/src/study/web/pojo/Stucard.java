package study.web.pojo;

public class Stucard {
    private Integer id;

    private String stuno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }
    
    public String toString(){
    	return "card [id="+id+",stuno="+stuno+"]";
    }
}