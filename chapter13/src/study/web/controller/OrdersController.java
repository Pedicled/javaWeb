package study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.web.po.Orders;
import study.web.po.User;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
        Integer ordersID = orders.getOrdersID();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("ordersID = "+ordersID);
        System.out.println("username = "+username);
        return "success";
    }
}
