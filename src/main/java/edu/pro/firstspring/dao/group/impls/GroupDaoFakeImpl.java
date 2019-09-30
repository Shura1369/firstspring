package edu.pro.firstspring.dao.group.impls;

import edu.pro.firstspring.dao.group.Interfaces.IGroupDao;
import edu.pro.firstspring.model.Groupe;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
public class GroupDaoFakeImpl implements IGroupDao {
   private List<Groupe> groupes = new ArrayList<>(
            Arrays.asList(
                    new Groupe(1,"243","Ivanov"),
                    new Groupe(3,"245","Petrov"),
                    new Groupe(2,"244","Sidorov")
                    )
    );


    @Override
    public Groupe create(Groupe groupe) {
        int max = this.getAll().stream()
                .mapToInt(item->item.getId())
                .max().orElse(0);
        int newId = max +1;
        groupe.setId(newId);

        groupes.add(groupe);
        return this.get(newId);
    }

    @Override
    public Groupe get(int id) {
        return this.getAll().stream()
                .filter(groupe -> groupe.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Groupe update(Groupe groupe) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        Groupe groupe = this.get(id);
        System.out.println("FlagDAO");
        return this.getAll().remove(groupe);
    }

    @Override
    public List<Groupe> getAll() {
        return groupes;
    }
}
