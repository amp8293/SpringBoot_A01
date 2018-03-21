/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author amp
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("myvar", "Say hi to everyone");
        return "hometemplate";
    }
}
