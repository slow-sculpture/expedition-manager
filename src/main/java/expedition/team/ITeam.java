package expedition.team;

import expedition.members.Person;

import java.util.List;

public interface ITeam<E> {


    void addMember(Person person);


    void printTeamSquad(List<E> team);

}
