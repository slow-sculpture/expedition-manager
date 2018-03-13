package expedition;

import expedition.members.Climber;

import expedition.members.Person;

import expedition.team.Team;
import expedition.utils.fileReader.FileReaderFactory;
import expedition.utils.fileReader.IFileReader;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Climb the hill !!!!\nwith our new expeditionManager v1 beta !!!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the name of your team:");
        String name = scanner.nextLine();
        Team team = new Team(name);


        System.out.println("What you want to do ?:");
        printMenu();
        int choice = scanner.nextInt();

        boolean exit = false;
        while (!exit) {
            switch (choice) {
                case 1:
                    System.out.println("Give data of a new member:");
                    System.out.println("First name:");
                    String firstName = scanner.nextLine();
                    System.out.println("Last name:");
                    String lastName = scanner.nextLine();
                    System.out.println("Age:");
                    int age = scanner.nextInt();
                    System.out.println("Sex:");
                    String sex = scanner.nextLine();

                    Person newMember = new Climber(firstName, lastName, age, sex);
                    team.addMember(newMember);
                    break;

                case 2:
                    System.out.println("Give path of your file: ");
                    String path = scanner.nextLine();
                    IFileReader reader = FileReaderFactory.createReader(path);
                    List<Person> importedMembers = reader.read();
                    for(Person p : importedMembers){
                        team.addMember(p);
                    }
                    System.out.println("Import successful. All members added.");

                    break;
                case 3:

                    break;
                case 4:
                    team.printTeamSquad(team.getTeamSquad());
                    break;

                case 0:
                    System.out.println("Exiting expeditionManager v1 beta .... \nDone");
                    exit = true;
                    break;
                default:
                    break;
            }

        }

    }

    private static void printMenu() {
        // System.out.println("1. Create new team");
        System.out.println("1. Add new team member");
        System.out.println("2. Add memebers from file");
        System.out.println("3. Write team to file");
        System.out.println("4. Print list of members");
        System.out.println("0. Quit program");

    }
}
