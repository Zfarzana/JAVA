import java.util.Scanner;

public class Patient implements PatientInterfaces {
    String p_id, p_name, p_diseases, p_sex, p_admit_status, p_age;
    Scanner input = new Scanner(System.in);

    public void Add_New_Patient() {
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println("                         **  Add New Patient Information  **");
        System.out.println(
                "--------------------------------------------------------------------------------");
        System.out.println("Add New Patient Information");
        System.out.print("Enter Patient ID          : ");
        p_id = input.next();
        System.out.print("Enter Patient Name        : ");
        p_name = input.next();
        System.out.print("Enter Patient Diseases    : ");
        p_diseases = input.next();
        System.out.print("Enter Patient Gernder     : ");
        p_sex = input.next();
        System.out.print("Enter Patient Age         : ");
        p_age = input.next();

    }

    public void Show_Patient_Details() {

        System.out.print(p_id + "       ");
        System.out.print(p_name + "      ");
        System.out.print(p_diseases + "             ");
        System.out.print(p_sex + "          ");
        System.out.print(p_age + "          ");
        System.out.println("");
    }
}
