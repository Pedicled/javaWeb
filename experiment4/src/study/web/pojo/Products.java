package study.web.pojo;

import java.util.List;

public class Products {
    private Integer id;

    private String name;

    private Double price;
    
    private List<OrderPro> orderProList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public List<OrderPro> getOrderProList() {
        return orderProList;
    }

    public void setOrderProList(List<OrderPro> orderProList) {
        this.orderProList = orderProList;
    }
    public String toString(){
    	return "Product [id="+id+",name="+name+",price="+price+",ordersList="+orderProList+"]";
    }
}