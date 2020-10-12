package com.skates.skates;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class TypeController {
    @Resource
    private TypeRepository typeRepo;

    @RequestMapping({"/categories" ,"/" ,""})
    public String displayTypes(Model model){
        model.addAttribute("categories", typeRepo.findAll());
        return "categories";
    }
    @GetMapping("/categories/{category}")
    public String displayOneCategory(@PathVariable String category, Model model){
        Category retrievedCategory = typeRepo.findSkatesByCategory(category);
        model.addAttribute("category", retrievedCategory);
        return "category";
    }
}
