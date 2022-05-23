/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author saulp
 */
@RestController
public class WebServicesController {
    
    @GetMapping("/rest")
    public String takeRest(){
        System.out.println("Resting...");
        return "Rest is not necessary - Not a goal!";
    }
}
