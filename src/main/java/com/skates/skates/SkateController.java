package com.skates.skates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class SkateController {
    @Resource
    private SkateRepository skateRepo;
    @Resource
    private TypeRepository typeRepo;


    @RequestMapping("/skates")
    public String findAllSkates(Model model) {
        model.addAttribute("skatesModel", skateRepo.findAll());
        return "skates";
    }

    @RequestMapping("/skater")
    public String findSkatePair(@RequestParam(value = "id") Long id, Model model) {
        Optional<Skates> retrievedSkate =skateRepo.findById(id);
        Skates foundSkate =retrievedSkate.get();
        model.addAttribute("skateModel", foundSkate);
        return "skatePair";
    }

}
