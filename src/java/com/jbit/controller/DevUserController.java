package com.jbit.controller;

import com.jbit.entity.DevUser;
import com.jbit.service.DevUserMapperService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value ="/user")
public class DevUserController {
    @Resource
    private DevUserMapperService devUserMapperService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(DevUser user, Model model, HttpSession session){
        DevUser devUser=devUserMapperService.fingUser(user.getDevcode(),user.getDevpassword());
        if(devUser!=null){
            session.setAttribute("user",devUser);
            return "redirect:/jsp/developer/main.jsp";
        }
        model.addAttribute("error","用户名或者密码错误，请重新登录");
        return "jsp/devlogin";
    }

    @RequestMapping(value="/logout",method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.invalidate();
    return "redirect:/jsp/devlogin.jsp";
    }
}
