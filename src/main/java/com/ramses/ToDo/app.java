package com.ramses.ToDo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class app {
    @GetMapping("/")
    public String get(){
        return "redirect:/tasks";
    }
    @GetMapping("/error")
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception error) {
        ModelAndView mvn =  new ModelAndView("home/error");
        mvn.addObject("error", error);
        return mvn;
    }
}
