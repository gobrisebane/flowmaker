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
   
   /*
   * vol2 rebase test 2
   *
   * by choi
   * */
   
   @GetMapping("/")
   public String index(Model model){
	  System.out.println("main_branch_test");
	  return "main_braS";
   }


}
