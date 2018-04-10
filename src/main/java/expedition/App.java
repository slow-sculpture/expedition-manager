package expedition;

import expedition.members.MemberCreatorFactory;
import expedition.members.Person;
import expedition.team.Team;
import expedition.team.TeamRepo;
import expedition.user.User;
import expedition.user.UserRepo;
import expedition.utils.fileReader.FileReaderFactory;
import expedition.utils.fileReader.IFileReader;
import expedition.utils.fileWriter.TextFileWriter;
import expedition.utils.fileWriter.IFileWriter;

import java.util.List;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Climb the hill !!!!\nwith our new expeditionManager v1 beta !!!\n");

        register();


        System.out.println("Give the name of your team:");
        String name = scanner.nextLine();
        Team team = new Team(name);
        TeamRepo.save(team);


        boolean exit = false;
        while (!exit) {
            printMenu();
            System.out.println("\nWhat you want to do ?:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewMember(team);
                    break;

                case 2:
                    importFromFile(team);
                    break;
                case 3:
                    exportToFile(team);
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

    private static void register() {
        System.out.println("Please register");
        System.out.println("First name:");
        String firstName = scanner.next();
        System.out.println("Last name:");
        String lastName = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("Password:");
        String pwd = scanner.next();
        User user = new User(email,pwd,firstName,lastName);
        UserRepo.save(user);
        System.out.println("Log in successful");
    }


    private static void printMenu() {
        // System.out.println("1. Create new team");
        System.out.println("\n1. Add new team member");
        System.out.println("2. Import members from file");
        System.out.println("3. Export members to file");
        System.out.println("4. Print team members");
        System.out.println("0. Quit program");

    }

    private static void addNewMember(Team team) {


        System.out.println("What is the profession of a new member?");
        System.out.println("Tap 'c' for Climber, 's' for Sherpa, 'm' for Medical or 'k' for Cook");
        String key = scanner.next();
        if (!(key.equalsIgnoreCase(("c"))
                || (key.equalsIgnoreCase("s"))
                || (key.equalsIgnoreCase("m"))
                || (key.equalsIgnoreCase("k")))) {
            System.out.println("Wrong input given. Exiting creator...");

        } else {
            Person newMember = MemberCreatorFactory.createMember(key);
            team.addMember(newMember);
            System.out.println("Adding successful.\n");
        }
    }


    private static void importFromFile(Team team) {
        System.out.println("Precautions:\n1. Supported file format: *.csv *.txt" +
                "\n2. Proper data type:\n    - first line - headers -> first name;last name;age;sex" +
                "\n    - next lines - member data" +
                "\n    - delimiters - ';'\n");

        System.out.println("Give the path of your file with file extension: ");
        String path = scanner.next();
        IFileReader reader = FileReaderFactory.createReader(path);
        List<Person> importedMembers = reader.read();
        for (Person p : importedMembers) {
            team.addMember(p);
        }
        System.out.println("Import successful. All members added.\n");
    }

    private static void exportToFile(Team team) {
        System.out.println("Precautions:\n1. Supported file format: *.txt\n");
        System.out.println("Give the path of your file with file extension: ");
        String path = scanner.next();
        IFileWriter writer = new TextFileWriter(path);
        writer.write(team.getTeamSquad());
        System.out.println("Export successful.\n");

    }
}
