package study.web.po;

public class User {
    private Integer id;
    private String username;
    private Integer password;

    public Integer getId() {
        return id;
    }

    public Integer getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
