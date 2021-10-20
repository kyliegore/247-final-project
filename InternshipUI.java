import java.util.Scanner;

public class InternshipUI {
    private static final String WELCOME_MESSAGE = "Welcome to INTERNal Job Search";
    private String[] mainMenuOptions = {"Login", "Search for Jobs"};
    private Scanner scanner;
    private Internship internship;

    InternshipUI() {
        scanner = new Scanner(System.in);
        internship = new Internship();
    }

    public void run() {
        System.out.println(WELCOME_MESSAGE);

        while(true) {
            
        }
    }

    private void displayMainOptions() {
        System.out.println("Main Menu");
        for (int i = 0; i < mainMenuOptions.length; i++) {
            System.out.println((i+1) + ". " + mainMenuOptions[i]);
        }
    }

    private int getUserCommand() {
        return 0;
    }

    //need private void methods for each menu option

    public static void main(String[] args) {
        InternshipUI internshipInterface = new InternshipUI();
        internshipInterface.run();
    }


}
