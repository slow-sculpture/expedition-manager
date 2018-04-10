package expedition.team;

import expedition.members.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team implements ITeam<Person>, Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private List<Person> teamSquad;

    public Team(String name) {
        this.name = name;
        this.teamSquad = new ArrayList<>();
    }


    @Override
    public void addMember(Person person) {
        teamSquad.add(person);
           }

    @Override
    public void printTeamSquad(List<Person> team) {
        for(Person p : team){
            System.out.println(p != null ? p.getDescription() : "Member list is empty !");
        }

    }

    public String getName() {
        return name;
    }

    public List<Person> getTeamSquad() {
        return teamSquad;
    }
}
