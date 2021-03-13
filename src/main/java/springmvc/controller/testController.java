package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping(value = "/hello")
    public String hello(){
        System.out.println("请求成功");
        return "Hello";
    }
}
