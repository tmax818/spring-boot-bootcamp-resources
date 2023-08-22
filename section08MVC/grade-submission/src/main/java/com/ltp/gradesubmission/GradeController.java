package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    // Grade[] grades = {
    //     new Grade("Harry", "potions", "C-"),
    //     new Grade("Hermine", "math", "A-"),
    //     new Grade("Ron", "science", "D+")
    // };
    
    List<Grade> grades = new ArrayList<>();


    @GetMapping("/hello")
    public String sayHello(){
        return "somehtml";
    }

    
    @GetMapping("/grades")
    public String getGrades(Model model){
        Grade grade = new Grade("Harry", "potions", "C-");
        model.addAttribute("grade", grade);
        model.addAttribute("grades", grades);
        return "grades";
    }

    @GetMapping("/")
    public String gradeForm(Model model, @RequestParam(required = false) String name) {
        System.out.println(name);
        Integer idx = this.getGradeIndex(name);
        boolean test = idx == -1;
        model.addAttribute("grade", test ? new Grade(): grades.get(idx));
        return "form";
    }

    @PostMapping("/handleForm")
    public String handleForm(Grade grade){
            Integer idx = this.getGradeIndex(grade.getName());
            if(idx != -1){
                grades.set(idx, grade);
            } else {
                this.grades.add(grade);
            }
        

        return "redirect:/grades";
    }

    // helper methods

    public Integer getGradeIndex(String name){
        for(Grade grade : grades){
            if(grade.getName().equals(name)){
                return grades.indexOf(grade);
        }
    }
        return -1;
}

    
}
