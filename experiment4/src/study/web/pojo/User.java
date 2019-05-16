package study.web.pojo;

import java.util.List;

public class User {
    private Integer id;

    private String username;

    private String phone;

    private String address;
    
    private List<Orders> ordersList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    
    public String toString(){
    	return "User [id="+id+",username="+username+",phone"+phone+",address"+address+",orderslist"+ordersList+"]";
    }
}