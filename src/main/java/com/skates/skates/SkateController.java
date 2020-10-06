package com.skates.skates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class SkateController {
    @Resource
    private SkateRepository skateRepo;

    @RequestMapping("/skates")
    public String findAllSkates(Model model) {
        model.addAttribute("skatesModel", skateRepo.findAll());
        return "skates";
    }

    @RequestMapping("/skater")
    public String findSkatePair(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("skateModel", skateRepo.findOne(id));
        return "skatePair";
    }

}
