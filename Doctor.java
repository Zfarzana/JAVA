import java.util.Scanner;

public class Doctor implements Doctorinterfeces {
    String D_name, D_id, D_quali, specilist, appointment, d_room;
    Scanner input = new Scanner(System.in);

    public void Add_New_Doctor() {

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                         **  Add New Doctor Information  **");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Enter ID             : ");
        D_id = input.next();
        System.out.print("Enter NAME           : ");
        D_name = input.next();
        System.out.print("Enter Specilization  : ");
        specilist = input.next();
        System.out.print("Enter Work Time      : ");
        appointment = input.next();
        System.out.print("Enter Qualification  : ");
        D_quali = input.next();
        System.out.print("Enter Room No      : ");
        d_room = input.next();

    }

    public void Show_Doctor_info() {
        System.out.println(D_id + "       " + D_name + "      " + specilist + "             " + appointment
                + "                  " + D_quali
                + "                " + d_room + "     ");
        System.out.println("");
    }
}