package com.stackroute.controller;

import com.stackroute.beanClass.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        User user =new User();
        user.setNameOfUser("anurag");
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
