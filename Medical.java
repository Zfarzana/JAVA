import java.util.Scanner;

public class Medical extends Medi {
    String med_name, med_comp, exp_date;
    int medcine_cost, count;

    void Add_New_Medicine() {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println("                           **  Add New Medicine Information  **");
        System.out.println(
                "--------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Medicine Name         : ");
        med_name = input.next();
        System.out.print("Enter Medicine Company      : ");
        med_comp = input.next();
        System.out.print("Enter Expiry Date           : ");
        exp_date = input.next();
        System.out.print("Enter Medicine Cost         : ");
        medcine_cost = input.nextInt();
        System.out.print("Enter Number of Medicine    : ");
        count = input.nextInt();

    }

    void Show_New_Medicine_Information() {
        System.out.print(med_name + "         " + med_comp + "        " + exp_date + "          " + medcine_cost
                + "          " + count + "          ");
        System.out.println("");

    }
}
