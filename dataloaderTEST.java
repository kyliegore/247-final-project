import java.util.ArrayList;

public class dataloaderTEST {

    public static void main(String[] args) {
        ArrayList<Employer> employers = DataLoader.getEmployers();

        for(Employer employer : employers) {
            System.out.println(employer);
        }

    }
    
}
