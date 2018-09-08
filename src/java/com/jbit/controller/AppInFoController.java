package com.jbit.controller;

import com.jbit.service.AppInFoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/app")
public class AppInFoController {

    @Resource
    private AppInFoService appInFoService;
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("applist",appInFoService.findAppInfo());
        return "jsp/developer/appinfolist";
    }
}
