import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        Calendar cal = Calendar.getInstance();
        int count1 = 4, count2 = 4, count3 = 10, count4 = 4, count5 = 11, count6 = 4, count9 = 3, count10 = 4;
        System.out.println(
                "*********************************************************************************************************************");
        System.out.println("                                  Welcome To The TFZF Hospital                          ");
        System.out.println(
                "*********************************************************************************************************************");
        System.out.println("Date   : " + cal.get(Calendar.DATE) + " " + month[cal.get(Calendar.MONTH)] + " "
                + cal.get(Calendar.YEAR));

        System.out.println("Time   : " + cal.get(Calendar.HOUR) + ":" + cal.get(+Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));
        Doctor[] d = new Doctor[100];
        Patient[] p = new Patient[1000];
        Lab l[] = new Lab[20];
        Fecility[] f = new Fecility[20];
        Medical m[] = new Medical[1000];
        Staff[] s = new Staff[100];
        CanteenTfzf c[] = new CanteenTfzf[15];
        AmbulanceTfzf A[] = new AmbulanceTfzf[5];
        AmbulanceSearch A1[] = new AmbulanceSearch[5];
        Emergency E[] = new Emergency[10];

        for (int i = 0; i < 10; i++)
            E[i] = new Emergency();
        for (int i = 0; i < 5; i++)
            A1[i] = new AmbulanceSearch();
        for (int i = 0; i < 5; i++)
            A[i] = new AmbulanceTfzf();

        for (int i = 0; i < 15; i++)
            c[i] = new CanteenTfzf();
        for (int i = 0; i < 100; i++)
            d[i] = new Doctor();
        for (int i = 0; i < 1000; i++)
            p[i] = new Patient();
        for (int i = 0; i < 20; i++)
            l[i] = new Lab();
        for (int i = 0; i < 20; i++)
            f[i] = new Fecility();
        for (int i = 0; i < 1000; i++)
            m[i] = new Medical();
        for (int i = 0; i < 100; i++)
            s[i] = new Staff();

        d[0].D_id = "D-0001";
        d[0].D_name = "Dr.Toukir Ahmed ";
        d[0].D_quali = "FCPH";
        d[0].appointment = "8-12AM";
        d[0].specilist = "Surgeon";
        d[0].d_room = "303";

        d[1].D_id = "D-0002";
        d[1].D_name = "Dr.Fahim Rahman";
        d[1].D_quali = "MBBS";
        d[1].appointment = " 2-5 AM";
        d[1].d_room = "305";
        d[1].specilist = " E.N.T.";
        d[2].D_id = "D-0003";
        d[2].D_name = "Dr.Faiza Mahabub";
        d[2].D_quali = "MBBS";
        d[2].appointment = "  6-10AM";
        d[2].d_room = "307";
        d[2].specilist = "Artho";

        d[3].D_id = "D-0003";
        d[3].D_name = "Dr.Tanvir Rahman";
        d[3].D_quali = "MBBS";
        d[3].appointment = " 2-5 AM";
        d[3].d_room = "309";
        d[3].specilist = " E.N.T.";
        d[4].D_id = "D-0004";
        d[4].D_name = "Dr.Tasnim Mahabub";
        d[4].D_quali = "MBBS";
        d[4].appointment = "  6-10AM";
        d[4].d_room = "311";
        d[4].specilist = "Artho";

        p[0].p_id = "P-000001";
        p[0].p_name = "Tamim Ahmed";
        p[0].p_age = "25";
        p[0].p_diseases = "Cancer";
        p[0].p_sex = "Male ";
        p[0].p_admit_status = "yes";
        p[1].p_id = "P-000002";
        p[1].p_name = "Zerin Rahman";
        p[1].p_age = "23";
        p[1].p_diseases = "Fever";
        p[1].p_sex = "Female";
        p[1].p_admit_status = "yes";

        p[2].p_id = "P-000003";
        p[2].p_name = "Tamim Ahmed";
        p[2].p_age = "25";
        p[2].p_diseases = "Cancer";
        p[2].p_sex = "Male ";
        p[2].p_admit_status = "yes";
        p[3].p_id = "P-000004";
        p[3].p_name = "Tasnia Farin";
        p[3].p_age = "23";
        p[3].p_diseases = "Fever";
        p[3].p_sex = "Female";
        p[3].p_admit_status = "yes";

        m[0].med_name = "Napa ";
        m[0].count = 1;
        m[0].exp_date = " 22-10-23";
        m[0].med_comp = "  Renata Pharmaceuticals Limited ";
        m[0].medcine_cost = 20;
        m[1].med_name = "Fexo ";
        m[1].count = 1;
        m[1].exp_date = "22-02-23";
        m[1].med_comp = "  Incepta Pharmaceuticals Limited ";
        m[1].medcine_cost = 30;
        m[2].med_name = "Bizoran";
        m[2].count = 1;
        m[2].exp_date = "2-10-23";
        m[2].med_comp = "Beximco Pharmaceuticals Limited ";
        m[2].medcine_cost = 120;
        m[3].med_name = "Bislol";
        m[3].count = 1;
        m[3].exp_date = " 13-02-23";
        m[3].med_comp = " Square Pharmaceuticals Limited ";
        m[3].medcine_cost = 40;
        m[4].med_name = "Pride ";
        m[4].count = 1;
        m[4].exp_date = " 13-7-29";
        m[4].med_comp = " Square Pharmaceuticals Limited ";
        m[4].medcine_cost = 10;
        m[5].med_name = "DonA ";
        m[5].count = 1;
        m[5].exp_date = " 19-9-27";
        m[5].med_comp = "  Beximco Pharmaceuticals Limited";
        m[5].medcine_cost = 3;
        m[6].med_name = "Emistat";
        m[6].count = 1;
        m[6].exp_date = " 23-10-30";
        m[6].med_comp = "Square Pharmaceuticals Limited ";
        m[6].medcine_cost = 7;
        m[7].med_name = "Beklo  ";
        m[7].count = 1;
        m[7].exp_date = " 19-11-31";
        m[7].med_comp = "Incepta Pharmaceuticals Limited";
        m[7].medcine_cost = 8;
        m[8].med_name = "cal-20 ";
        m[8].count = 1;
        m[8].exp_date = " 9-9-29";
        m[8].med_comp = "Square Pharmaceuticals Limited ";
        m[8].medcine_cost = 5;
        m[9].med_name = "Antazol";
        m[9].count = 1;
        m[9].exp_date = " 17-1-28";
        m[9].med_comp = "Beximco Pharmaceuticals Limited";
        m[9].medcine_cost = 250;

        l[0].fecility = "X-ray  ";
        l[0].lab_cost = 500;
        l[1].fecility = "CT Scan";
        l[1].lab_cost = 3000;
        l[2].fecility = "MRI    ";
        l[2].lab_cost = 2000;
        l[3].fecility = "E.C.G. ";
        l[3].lab_cost = 500;
        f[0].fecility_name = "1. Canteen";
        f[1].fecility_name = "2. Ambulance ";
        f[2].fecility_name = "3. Emergency";

        s[0].staff_id = "S-00001";
        s[0].staff_name = "MD Shamim Hasan ";
        s[0].staff_desg = "Worker";
        s[0].staff_sex = "Male  ";
        s[0].staff_salary = 6000;
        s[1].staff_id = "S-00002";
        s[1].staff_name = "MST Monira Begum";
        s[1].staff_desg = "Nurse ";
        s[1].staff_sex = "Female";
        s[1].staff_salary = 4000;
        s[2].staff_id = "S-00003";
        s[2].staff_name = "Md Fahim Hossen ";
        s[2].staff_desg = "Worker";
        s[2].staff_sex = "Male  ";
        s[2].staff_salary = 6000;
        s[3].staff_id = "S-00004";
        s[3].staff_name = "Mst Nisa Akter  ";
        s[3].staff_desg = "Nurse ";
        s[3].staff_sex = "Female";
        s[3].staff_salary = 4000;

        c[0].name = "Burger     ";
        c[0].price_c_food = 300;
        c[1].name = "pizza      ";
        c[1].price_c_food = 500;
        c[2].name = "Tea        ";
        c[2].price_c_food = 90;
        c[3].name = "Coffe      ";
        c[3].price_c_food = 180;
        c[4].name = "Rice       ";
        c[4].price_c_food = 20;
        c[5].name = "Mutton     ";
        c[5].price_c_food = 200;
        c[6].name = "Beef       ";
        c[6].price_c_food = 220;
        c[7].name = "Chicken Fry";
        c[7].price_c_food = 300;
        c[8].name = "Coke       ";
        c[8].price_c_food = 150;
        c[9].name = "Sprite     ";
        c[9].price_c_food = 100;
        c[10].name = "Ice Cream  ";
        c[10].price_c_food = 250;
        A[0].driver_id = "A-0001";
        A[0].driver_name = "Rayhan kabir";
        A[0].driver_phn_number = "01790952728";
        A[0].driver_address = "Birampur, Dinajpur";
        A[1].driver_id = "A-0002";
        A[1].driver_name = "Samsul Rahman";
        A[1].driver_phn_number = "017907699";
        A[1].driver_address = "Phulbari, Dinajpur";
        A[2].driver_id = "A-0003";
        A[2].driver_name = "TaREK Mahmud";
        A[2].driver_phn_number = "017907699";
        A[2].driver_address = "Hili, Dinajpur";
        A[3].driver_id = "A-0004";
        A[3].driver_name = "Taharat Mahmud";
        A[3].driver_phn_number = "017907699";
        A[3].driver_address = "Parbatipur, Dinajpur";
        A1[0].driver1_id = 1;
        A1[0].driver_name = "Rayhan kabir";
        A1[0].driver_phn_number = "01790952728";
        A1[0].driver_address = "Birampur, Dinajpur";
        A1[1].driver1_id = 2;
        A1[1].driver_name = "Samsul Rahman";
        A1[1].driver_phn_number = "017907699";
        A1[1].driver_address = "Phulbari, Dinajpur";
        A1[2].driver1_id = 3;
        A1[2].driver_name = "TaREK Mahmud";
        A1[2].driver_phn_number = "017907699";
        A1[2].driver_address = "Hili, Dinajpur";
        A1[3].driver1_id = 4;
        A1[3].driver_name = "Taharat Mahmud";
        A1[3].driver_phn_number = "017907699";
        A1[3].driver_address = "Parbatipur, Dinajpur";

        E[0].cov_p_n = "TURZO";
        E[0].cov_p_id = "C-0001";
        E[0].cov_p_phn = "01790952728";
        E[0].cov_p_hn = "BLOCK-D";
        E[0].cov_p_address = "MIRPUR";

        E[1].cov_p_n = "TANIM";
        E[1].cov_p_id = "C-0002";
        E[1].cov_p_phn = "01790952333";
        E[1].cov_p_hn = "BLOCK-A";
        E[1].cov_p_address = "MIRPUR";

        E[2].cov_p_n = "TONOY";
        E[2].cov_p_id = "C-0003";
        E[2].cov_p_phn = "01790952444";
        E[2].cov_p_hn = "BLOCK-C";
        E[2].cov_p_address = "MIRPUR";

        E[3].cov_p_n = "TONNI";
        E[3].cov_p_id = "C-0004";
        E[3].cov_p_phn = "01790952666";
        E[3].cov_p_hn = "BLOCK-E";
        E[3].cov_p_address = "MIRPUR";

        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                           Main Menu                     ");
            System.out
                    .println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out
                    .println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(
                         "------------------------------------------------------------------------------------");
                    System.out.println(
                            "                           **  DOCTOR SECTION  **                                       ");
                    System.out.println(
                            "------------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1. Add New Doctor");
                        System.out.println("2. Show Doctor List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                d[count1].Add_New_Doctor();
                                count1++;
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                         **  Showing Doctor Information  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------------------------");
                                System.out.println("ID    " + "       Name  " + "               Specilist "
                                        + "           Timing " + "              Qualification " + "        Room No");
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++) {
                                    d[j].Show_Doctor_info();
                                }
                                break;
                            }
                        }
                        // System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        System.out.println("1. Go To Previous Page");
                        System.out.println("2. Go To Main Menu");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                         **  PATIENT SECTION  **");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1. Add New Patient");
                        System.out.println("2. Show Patient List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].Add_New_Patient();
                                count2++;
                                break;
                            }
                            case 2: {

                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                         **  Showing Patient Information  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println(
                                        "ID            " + " Name            " + " Disease          "
                                                + " Gender       " + " Age        ");
                                System.out.println(
                                        "----------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].Show_Patient_Details();
                                }
                                break;
                            }
                        }
                        System.out.println("1. Go Back To Previous page");
                        System.out.println("2. Go To Main Menu  ");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1. Add New Medicine");
                        System.out.println("2. Show Medicine Information");
                        System.out.println("3. Buy Medicine      ");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                m[count3].Add_New_Medicine();
                                count3++;
                                break;
                            }

                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                         **  Showing Medicine Information  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println(
                                        "------------------------------------------------------------------------------------------------------");
                                System.out.println(
                                        "Name           " + " Company                               "
                                                + "Expiry Date      " + " Cost      " + " Count");
                                System.out.println(
                                        "------------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].Show_New_Medicine_Information();
                                }
                                break;
                            }
                            case 3: {
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------------");

                                System.out.println("                             ** Medicine  **  ");
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------------");
                                System.out.println();
                                System.out.println(
                                        "Name           " + " Company                               "
                                                + "Expiry Date      " + " Cost      " + " Count");
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].Show_New_Medicine_Information();
                                }
                                m[j].Medi1();
                                break;
                            }

                        }
                        System.out.println("1. Go Back To Prevoius Page");
                        System.out.println("2. Go To Main Menu");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1. Add New Laboratory Test ");
                        System.out.println("2. Show Laboratory List");
                        System.out.println("3. Make a Test ");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                l[count4].Add_new_Fecility();
                                count4++;
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                       **  Showing Fecility Information  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");

                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Fecilities         " + " Cost");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (j = 0; j < count4; j++) {
                                    l[j].Show_Fecility();
                                }
                                break;
                            }
                            case 3: {

                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("Fecilities         " + " Cost");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (j = 0; j < 4; j++) {
                                    l[j].Show_Fecility();
                                    ;
                                }
                                System.out.println("");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                       **  Make a Laboratory Test  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");

                                l[j].Lab_Report_and_cost();
                                ;
                            }
                        }
                        System.out.println("");
                        System.out.println("1. Go Back To Prevoius Page");
                        System.out.println("2. Go To Main Menu");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    s5 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1. Add New Facility ");
                        System.out.println("2. Show Facility List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                f[count9].Add_Fecility();
                                count5++;
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                   **  Hospital  Facility are  **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                for (j = 0; j < count9; j++) {
                                    f[j].Show_Fecility();
                                }
                                break;
                            }
                        }
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                System.out.println(
                                        "----------------------------------------------------------------------------------");
                                System.out.println("                      **  Canteen  **");
                                System.out.println(
                                        "----------------------------------------------------------------------------------");
                                System.out.println("1. Add New Food");
                                System.out.println("2. Show Food Item");
                                System.out.println("3. Order now");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        System.out.println(
                                                "----------------------------------------------------------------------------------");
                                        System.out.println("                      **  Add New Food Item  **");
                                        System.out.println(
                                                "----------------------------------------------------------------------------------");
                                        c[count5].Add_new_Food_item();
                                        count5++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------");
                                        System.out.println("          ** Showing Food item & Price **");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------");
                                        System.out.println("Name                   " + " price ");
                                        System.out.println(
                                                "-----------------------------------------------------------------------------------");
                                        System.out.println("");
                                        System.out.println("");
                                        for (j = 0; j < 11; j++) {
                                            c[j].show_food();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Name     " + " price ");
                                        System.out.println("");
                                        System.out.println("");
                                        for (j = 0; j < 11; j++) {

                                            c[j].show_food();

                                        }
                                        c[1].Choose_and_Order();
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2: {

                                System.out.println(
                                        "------------------------------------------------------------------------------------");
                                System.out.println(
                                        "                      **Ambulance Management**                                                   ");
                                System.out.println(
                                        "------------------------------------------------------------------------------------");
                                System.out.println("1. Ambulance Details ");
                                System.out.println("2. search ambulance");
                                System.out.println("3. Hire Ambulance");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        System.out.println("");
                                        System.out.println(
                                                "------------------------------------------------------------------------------------");
                                        System.out.println(
                                                "                      **Driver Information**                                                   ");
                                        System.out.println(
                                                "------------------------------------------------------------------------------------");
                                        System.out.println(
                                                "Driver ID   " + "Driver Name      " + "Phone Number     " + "Address");
                                        System.out.println("");
                                        for (j = 0; j < 4; j++) {

                                            A[j].Ambulance_show();
                                        }
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "------------------------------------------------------------------------------------");
                                        System.out.println(
                                                "                      **Ambulance Search **                                                   ");
                                        System.out.println(
                                                "------------------------------------------------------------------------------------");

                                        for (j = 0; j < 4; j++) {
                                            A1[j].search1();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        for (j = 0; j < 4; j++) {
                                            A1[0].HireAmbulance();
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3: {

                                System.out.println(
                                        "------------------------------------------------------------------------------------");
                                System.out.println(
                                        "                      **Emergency Unit **                                                   ");
                                System.out.println(
                                        "------------------------------------------------------------------------------------");
                                System.out.println("1. Add Covid-19 Patient ");
                                System.out.println("2. Show Covid-19 Patient List");
                                System.out.println("3. Show Non-Covid Patient list");
                                c1 = input.nextInt();
                                switch (c1) {
                                    case 1: {
                                        E[count10].Add_New_Covid_Patient();
                                        count10++;
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "--------------------------------------------------------------------------------");
                                        System.out.println("          ** Showing Covid Patient Information **");
                                        System.out.println(
                                                "--------------------------------------------------------------------------------");
                                        for (j = 0; j < count10; j++) {
                                            E[j].show_covid_patient_information();
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println(
                                                "--------------------------------------------------------------------------------");
                                        System.out.println(
                                                "                  ** Showing Non-Covid Patient Information **");
                                        System.out.println(
                                                "--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].Show_Patient_Details();
                                        }
                                        break;
                                    }

                                }

                            }

                        }
                        System.out.println("");
                        System.out.println("1. Go Back To Prevoius Page");
                        System.out.println("2. Go To Main Menu");
                        s5 = input.nextInt();

                    }
                    break;
                }
                case 6: {
                    s6 = 1;
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println(
                            "--------------------------------------------------------------------------------");
                    while (s6 == 1) {
                        // String a="nurse",b="worker",c="Security";
                        System.out.println("1. Add New Staff ");
                        System.out.println("2. Show Staff List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                s[count6].Add_New_Staff();
                                count6++;
                                break;
                            }
                            case 2: {
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println("                  ** Showing Staff Information **");
                                System.out.println(
                                        "--------------------------------------------------------------------------------");
                                System.out.println(
                                        "-----------------------------------------------------------------------------------------------");
                                System.out
                                        .println("id              " + " Name                     "
                                                + " Gender            " + "Dept.          " + " Salary ");
                                System.out.println(
                                        "------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    s[j].Show_Staff_information();
                                }
                                break;

                            }
                        }

                        System.out.println("1. Go Back To Prevoius Page");
                        System.out.println("2. Go To Main Menu");
                        s6 = input.nextInt();
                    }
                    break;

                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice");

                }

            }
            System.out.println("1. Go To Main Menu");
            status = input.nextInt();

        }

    }

}
