import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Anton, Christian, Kylie, Jack
 */
/*
public class InternshipUI {
    private static final String WELCOME_MESSAGE = "Welcome to INTERNal Job Search";
    private String[] mainMenuOptions = {"Login as Student", "Login as Employer", "Login as Admin"};
    private String[] studentMenu = {"Search Jobs", "Create Resume", "View Account", "Logout"};
    private String[] employeeMenu = {"Search Jobs", "Create Job Listing", "View Account", "Remove Job", "Edit Job", "Logout"};
    private String[] adminMenu = {"Remove Job Listing", "Remove a Profile", "Logout"};
    private Scanner scanner;
    private Internship internship;

    InternshipUI() {
        scanner = new Scanner(System.in);
        internship = new Internship();
    }

    public void run() {
        System.out.println(WELCOME_MESSAGE);

        while(true) {
            displayOptions(mainMenuOptions);

            int userCommand = getUserCommand(mainMenuOptions.length);

            if (userCommand == -1) {
                System.out.println("Invalid Command");
                continue;
            }

            switch(userCommand) {
				case(0):
					login();
					break;
				case(1):
					employeeLogin();
					break;
				case(2):
					adminLogin();
					break;
            }
        }
    }

    private void displayOptions(String[] array) {
        System.out.println("Main Menu");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
    }

    private int getUserCommand(int numCommands) {
        System.out.print("What would you like to do?: ");
		
		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;
		
		if(command >= 0 && command <= numCommands -1) return command;
		
		return -1;
    }

    private void studentLogin() {
        
        System.out.println("\nSuccessfully logged in as Student.");
        while(true) {
            displayOptions(studentMenu);

            int userCommand = getUserCommand(studentMenu.length);

            if (userCommand == -1) {
                System.out.println("Invalid Command");
                continue;
            }

            if(userCommand == studentMenu.length -1) break;

            switch(userCommand) {
				case(0):
					searchJobs();
					break;
				case(1):
					createResume();
					break;
				case(2):
					viewAccount();
					break;
            }
        }
    }

    private void employeeLogin() {

        System.out.println("\nSuccessfully logged in as employer.");
        while(true) {
            displayOptions(employeeMenu);

            int userCommand = getUserCommand(employeeMenu.length);

            if (userCommand == -1) {
                System.out.println("Invalid Command");
                continue;
            }

            if(userCommand == employeeMenu.length -1) break;

            switch(userCommand) {
				case(0):
					searchJobs();
					break;
				case(1):
					createJobListing();
					break;
				case(2):
					viewAccount();
					break;
                case(3):
                    removeJob();
                    break;
                case(4):
                    editJob();
                    break;
            }
        }
    }

    private void adminLogin() {
        System.out.println("\nSuccessfully logged in as Admin.");
        while(true) {
            displayOptions(adminMenu);

            int userCommand = getUserCommand(adminMenu.length);

            if (userCommand == -1) {
                System.out.println("Invalid Command");
                continue;
            }

            if(userCommand == adminMenu.length -1) break;

            switch(userCommand) {
				case(0):
					removeJobListing();
					break;
				case(1):
					removeProfile();
					break;
            }
        }
    }
    private void signup() {

        
    }
    private void login() {
        String userName = getField("Username");

        if(internship.login(userName)) {
            Student currentUser = internship.getCurrentUser();
            System.out.println("Welcome"+ currentUser.getFirstName()+ " " + currentUser.getLastName());

        } else {
            System.out.println("Invalid Username!");
        }

        // System.out.println("Enter Username:\n");
        // String username = scanner.nextLine();

        // System.out.println("Enter Password: \n");
        // String password = scanner.nextLine();
        // if(username = 


    }

    private String getField(String promt) {
        System.out.println(promt+": ");
        return scanner.nextLine();
    }

    private void searchJobs() {
        
    }

    private void createResume() {
        System.out.println("Please enter the following information. After entering each item hit enter.");
        System.out.println("First and Last Name: \n");
        String name = scanner.nextLine();
        System.out.println("Email: \n");
        String email = scanner.nextLine();
        System.out.println("Skills: \n");
        ArrayList<String> skills = new ArrayList<String>();
        skills.add(scanner.nextLine());
        System.out.println("Awards: \n");
        ArrayList<String> awards = new ArrayList<String>();
        awards.add(scanner.nextLine());
        System.out.println("Extracurriculars: \n");
        System.out.println("References: \n");
        System.out.println("Any work experience? Enter Y for yes or N for no\n");
    }

    private void createJobListing() {
        
    }

    private void removeJob() {
        
    }

    private void editJob() {
        
    }

    private void viewAccount() {

    }
    
    private void removeJobListing() {

    }
    
    private void removeProfile() {

    }
    //need private void methods for each menu option

    public static void main(String[] args) {
        InternshipUI internshipInterface = new InternshipUI();
        internshipInterface.run();
    }


}
*/