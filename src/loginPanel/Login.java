package loginPanel;

import java.util.Scanner;

public class Login {

    private String username = "user";
    private String password = "1234";


    public Login() {

        if (isValidUsername() && isValidPassword()) {

            System.out.println("Welcome!");

        } else {
            System.out.println("Try again..");
        }

    }

    public boolean isValidUsername() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username:");
        String userN = scanner.nextLine();

        if (userN.equals(this.username)) {
            return true;

        } else {
            return false;
        }

    }

    public boolean isValidPassword() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the password:");
        String passW = scan.nextLine();

        if (passW.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
    
}
