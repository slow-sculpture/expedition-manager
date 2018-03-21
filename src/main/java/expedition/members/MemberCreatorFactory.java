package expedition.members;


import java.util.Scanner;

public class MemberCreatorFactory {
    private static Scanner scanner = new Scanner(System.in);

    public MemberCreatorFactory() {
    }

    public static Person createMember(String key) {
        System.out.println("Give data of a new member !");
        System.out.println("First name:");
        String firstName = scanner.next();
        System.out.println("Last name:");
        String lastName = scanner.next();
        System.out.println("Age:");
        int age = scanner.nextInt();
        System.out.println("Sex:\tmale/female");
        String sex = scanner.next();

        if (key.equalsIgnoreCase("c")) {
            System.out.println("The biggest height achievement:");
            int height = scanner.nextInt();
            System.out.println("Stamina points");
            double stamina = scanner.nextDouble();
            System.out.println("Uses oxygen on big heights\n\ttrue/false ?");
            boolean o2 = scanner.nextBoolean();
            System.out.println("Overall rating");
            double rating = scanner.nextDouble();

            return new Climber(firstName, lastName, age, sex
                    , height, stamina, o2, rating);
        } else if (key.equalsIgnoreCase("s")) {
            return null;
        } else if (key.equalsIgnoreCase("m")) {
            return null;
        } else  {
            return null;
                }
    }
}


