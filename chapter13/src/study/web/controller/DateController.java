package study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/date")
public class DateController {

    @RequestMapping("/customDate")
    public String CustomDate(Date date){
        System.out.println("date = "+date);
        return "success";
    }
}
