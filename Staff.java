import java.util.Scanner;

public class Staff implements StaffInterfaces {
    String staff_id, staff_name, staff_sex, staff_desg;
    int staff_salary;

    public void Add_New_Staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Staff ID    : ");
        staff_id = input.next();
        System.out.print("Enter Staff Name  : ");
        staff_name = input.next();
        System.out.print("Enter Staff Gender: ");
        staff_sex = input.next();
        System.out.print("Enter Working As  : ");
        staff_desg = input.next();
        System.out.print("Enter Staff Salary: ");
        staff_salary = input.nextInt();

    }

    public void Show_Staff_information() {
        System.out.print(staff_id + "          " + staff_name + "           " + staff_sex + "           " + staff_desg
                + "           " + staff_salary + "          ");
        System.out.println("");
    }
}
