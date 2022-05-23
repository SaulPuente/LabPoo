/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.hellospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author saulp
 */
@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        System.out.println("Greetings...");
        model.addAttribute("message", "Welcome to Spring Boot with NetBeans IDE");
        return "hello";
    }
}
