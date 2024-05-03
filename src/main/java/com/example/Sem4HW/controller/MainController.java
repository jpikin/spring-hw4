package com.example.Sem4HW.controller;

import com.example.Sem4HW.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private MainService service;

    @GetMapping("/main")
    public String getMain(){
        return "main";
    }

    @GetMapping("/queue")
    public String getQueue(Model model) {
        model.addAttribute("queue", service.getQueue());
        return "queue";
    }

    @PostMapping("/queue")
    public String addToQueue(String s, Model m) {
        service.addToQueue(s);
        m.addAttribute("queue", service.getQueue());
        return "queue";
    }
    @GetMapping("/queue/{functionId}")
    public String removeFromQueue(@PathVariable String functionId, Model m){
        if("function".equals(functionId)) {
            service.removeFromQueue();
            m.addAttribute("queue", service.getQueue());
        }
        return "queue";
    }
}

