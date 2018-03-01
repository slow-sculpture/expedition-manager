package expedition;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Climb the hill !!!!\nwith our new expedition manager v1 beta !!!\n");

    Scanner scanner = new Scanner(System.in);
        System.out.println("What you want to do ? :");
        printMenu();
        int choice = scanner.nextInt();

    switch (choice){
        case 1:
            //create team
            break;
        case 2:
            //dodaj
            break;
        case 3:
            //read from file
            break;
        case 4:
            //write to file
            break;
        case 5:
            //list
            break;
        case 0:
            //exit
            break;
        default:
            break;


    }

    }

    private static void printMenu() {
        System.out.println("1. Create new team");
        System.out.println("2. Add new team member");
        System.out.println("3. Add memebers from file");
        System.out.println("4. Write team to file");
        System.out.println("5. Print list of members");
        System.out.println("0. Quit program");

    }
}
