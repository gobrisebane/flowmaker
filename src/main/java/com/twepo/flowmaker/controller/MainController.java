package com.twepo.flowmaker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
   
   
   /*
   * NEW VERSION ERA.. NEED TO IMPROVE
   *
   * */
   
   @GetMapping("/")
   public String index(Model model){
   
	  System.out.println("hello ");
	  
	  return "test..2";
   }


}
