package com.itheima.test;

import com.itheima.dao.CustomerDao;
import com.itheima.mapper.CustomerMapper;
import com.itheima.po.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

   @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void findCustomerByIdMapperTest(){
            ApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);
            Customer customer = customerMapper.findCustomerById(1);
            System.out.println(customer);
    }

}
