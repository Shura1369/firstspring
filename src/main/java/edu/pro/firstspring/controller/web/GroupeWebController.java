package edu.pro.firstspring.controller.web;

import edu.pro.firstspring.model.Groupe;
import edu.pro.firstspring.service.groupe.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class GroupeWebController {
    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("/groupe/list")
    public String showGrupes (Model model){

        model.addAttribute( "grupes", groupService.getAll() );
                return "grupelist";
    }


    @RequestMapping("/groupe/delete/{id}")
    String delete(Model model
            ,@PathVariable(value = "id") int id){
        System.out.println("Flag Controller");
        groupService.delete(id);
        model.addAttribute( "grupes", groupService.getAll() );
        return "grupelist";
    }
/*
    @RequestMapping("/groupe/get/{id}")
    Groupe show(@PathVariable(value = "id") int id){
        return groupService.get(id);
    }
*/



}
