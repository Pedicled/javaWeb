package study.web.po;

public class Orders {
    private Integer ordersID;
    private User user;

    public Integer getOrdersID() {
        return ordersID;
    }

    public User getUser() {
        return user;
    }

    public void setOrdersID(Integer ordersID) {
        this.ordersID = ordersID;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
