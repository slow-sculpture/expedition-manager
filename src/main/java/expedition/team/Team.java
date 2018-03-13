package expedition.team;

import expedition.members.Person;

import java.util.ArrayList;
import java.util.List;

public class Team implements ITeam<Person>{
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
            System.out.println(p != null ? p.toString() : "Member list is empty !");
        }

    }

    public String getName() {
        return name;
    }

    public List<Person> getTeamSquad() {
        return teamSquad;
    }
}
