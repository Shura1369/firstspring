package edu.pro.firstspring.service.groupe.impls;

import edu.pro.firstspring.dao.group.impls.GroupDaoFakeImpl;
import edu.pro.firstspring.model.Groupe;
import edu.pro.firstspring.service.groupe.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {
    @Autowired
    GroupDaoFakeImpl groupDaoFake;
    @Override
    public Groupe create(Groupe groupe) {
        return groupDaoFake.create(groupe);
    }

    @Override
    public Groupe get(int id) {
        return groupDaoFake.get(id);
    }

    @Override
    public Groupe update(Groupe groupe) {
        return groupDaoFake.update(groupe);
    }

    @Override
    public boolean delete(int id) {
        return groupDaoFake.delete(id);
    }

    @Override
    public List<Groupe> getAll() {
        return groupDaoFake.getAll();
    }

    @Override
    public Groupe getByName(String name) {
        return this.getAll().stream()
                .filter(groupe -> groupe.getName()
                .equals(name))
                .findFirst().orElse(null);
    }
}
