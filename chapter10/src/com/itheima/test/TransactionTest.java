package com.itheima.test;

import com.itheima.po.Customer;
import com.itheima.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试事务
public class TransactionTest {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("zhnagsan");
        customer.setJobs("manager");
        customer.setPhone("12345678911");
    }
}
