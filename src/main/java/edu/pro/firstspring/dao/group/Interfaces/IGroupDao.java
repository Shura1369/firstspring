package edu.pro.firstspring.dao.group.Interfaces;

import edu.pro.firstspring.model.Groupe;

import java.util.List;

public interface IGroupDao {
    Groupe create(Groupe groupe);
    Groupe get(int id);
    Groupe update(Groupe groupe);
    boolean delete(int id);
    List<Groupe> getAll();

}
