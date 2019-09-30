package edu.pro.firstspring.service.groupe.interfaces;

import edu.pro.firstspring.model.Groupe;

import java.util.List;

public interface IGroupService {
    Groupe create(Groupe groupe);
    Groupe get(int id);
    Groupe update(Groupe groupe);
    boolean delete(int id);
    List<Groupe> getAll();

    Groupe getByName(String name);

}
