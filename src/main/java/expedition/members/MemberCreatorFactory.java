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
            System.out.println("Stamina points:");
            double stamina = scanner.nextDouble();
            System.out.println("Uses oxygen on big heights\n\ttrue/false ?");
            boolean o2 = scanner.nextBoolean();
            System.out.println("Overall rating:");
            double rating = scanner.nextDouble();

            return new Climber(firstName, lastName, age, sex
                    , height, stamina, o2, rating);
        } else if (key.equalsIgnoreCase("s")) {
            System.out.println("Stamina points:");
            double stamina = scanner.nextDouble();
            System.out.println("Capacity [kg]:");
            int capacity = scanner.nextInt();
            System.out.println("Has yak\n\ttrue/false ?");
            boolean hasYak = scanner.nextBoolean();

            if (hasYak) {
                System.out.println("Yak capacity:");
                int yakCapacity = scanner.nextInt();
                return new Sherpa(firstName, lastName, age, sex
                        , stamina, capacity, hasYak, yakCapacity);
            } else return new Sherpa(firstName, lastName, age, sex, stamina, capacity);

        } else if (key.equalsIgnoreCase("m")) {
            System.out.println("Medicine specialization?");
            String specialization = scanner.next();
            return new Medical(firstName, lastName, age, sex, specialization);
        } else {
            System.out.println("Cuisine:");
            String cuisine = scanner.next();
            System.out.println("Chef's specialty:");
            String specialty = scanner.next();
            return new Cook(firstName, lastName, age, sex, cuisine, specialty);
        }
    }
}


