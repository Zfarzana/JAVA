import java.util.Scanner;

public class Lab extends LabReport {
    String fecility;
    int lab_cost;
    Scanner input = new Scanner(System.in);

    void Add_new_Fecility() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                         **  Add New Fecility Information  **");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Enter New Fecility    : ");
        fecility = input.nextLine();
        System.out.print("Enter Cost            : ");
        lab_cost = input.nextInt();

    }

    void Show_Fecility() {
        System.out.println(fecility + "             " + lab_cost + "" + " Tk");
    }
}
