package edu.pro.firstspring.controller.web;

import edu.pro.firstspring.service.groupe.impls.GroupServiceImpl;
import edu.pro.firstspring.service.person.impls.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonWebController {
    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/person/list")
    public String showPersons (Model model){

        model.addAttribute( "persons", personService.getAll() );
                return "personlist";
    }


    /*@RequestMapping("/groupe/delete/{id}")
    String delete(Model model
            ,@PathVariable(value = "id") int id){
        System.out.println("Flag Controller");
        groupService.delete(id);
        model.addAttribute( "grupes", groupService.getAll() );
        return "grupelist";
    }*/
/*
    @RequestMapping("/groupe/get/{id}")
    Groupe show(@PathVariable(value = "id") int id){
        return groupService.get(id);
    }
*/



}
