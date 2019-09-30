package edu.pro.firstspring.controller.rest;

import edu.pro.firstspring.dao.group.impls.GroupDaoFakeImpl;
import edu.pro.firstspring.model.Groupe;
import edu.pro.firstspring.model.Student;
import edu.pro.firstspring.service.groupe.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class GroupeRestController {
    @Autowired
    GroupServiceImpl groupService;

/*
    @RequestMapping("/groupe/list")
    List<Groupe> showStudents (){
                return groupService.getAll();
    }

    @RequestMapping("/groupe/delete/{id}")
    boolean delete(@PathVariable(value = "id") int id){
                return groupService.delete(id);
    }

    @RequestMapping("/groupe/get/{id}")
    Groupe show(@PathVariable(value = "id") int id){
        return groupService.get(id);
    }
*/


}
