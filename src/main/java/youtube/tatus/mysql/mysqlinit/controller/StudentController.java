package youtube.tatus.mysql.mysqlinit.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import youtube.tatus.mysql.mysqlinit.domain.Student;
import youtube.tatus.mysql.mysqlinit.service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Student> liststudent = service.listAll();
        model.addText("liststudent");
        System.out.print("Get /");
        return "index";
    }

    @GetMapping("new")
    public String add(Model model){
        model.addText("student");
        return "new";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student std){
        service.save(std);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudenPage(@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Student std = service.get(id);
        mav.addObject("student", std);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name="id") int id){
        service.delete(id);
        return "redirect:/";
    }
}
