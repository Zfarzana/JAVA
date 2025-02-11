import java.util.Scanner;

public class Fecility {
    String fecility_name;

    void Add_Fecility() {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println("                       **  Add New Fecility  **");
        System.out.println(
                "--------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fecility Name     : ");
        fecility_name = input.nextLine();
    }

    void Show_Fecility() {
        System.out.println(fecility_name);
    }
}
