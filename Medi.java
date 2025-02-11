import java.util.Scanner;

public class Medi {
        void Medi1() {

                System.out.println("");
                System.out.println("");

                Scanner m1 = new Scanner(System.in);
                int napa, fexo, Bislol, Pride, bizoran, dona, em, bel, cal, antazol, total;
                int t1;

                System.out.println("CHOOSE MEDICINE");
                System.out.println(
                                "--------------------------------------------------------------------------------");
                System.out.println("                              **  CHOOSE MEDICINE  **");
                System.out.println(
                                "--------------------------------------------------------------------------------");
                System.out.print("Enter Quantity of Napa         :  ");
                napa = m1.nextInt();
                System.out.print("Enter Quantity of Fexo         :  ");
                fexo = m1.nextInt();
                System.out.print("Enter Quantity of Bizoran      :  ");
                bizoran = m1.nextInt();
                System.out.print("Enter Quantity of Bislol       :  ");
                Bislol = m1.nextInt();
                System.out.print("Enter Quantity of Pride        :  ");
                Pride = m1.nextInt();
                System.out.print("Enter Quantity of DonA         :  ");
                dona = m1.nextInt();
                System.out.print("Enter Quantity of Emistat      :  ");
                em = m1.nextInt();
                System.out.print("Enter Quantity of Beklo        :  ");
                bel = m1.nextInt();
                System.out.print("Enter Quantity of Cal-20       :  ");
                cal = m1.nextInt();
                System.out.print("Enter Quantity of Antazol      :  ");
                antazol = m1.nextInt();
                System.out.println("");
                System.out.println("");
                System.out.println("Price of Napa          : " + napa + "x" + 20 + " = " + napa * 20 + " Tk");
                System.out.println("Price of Fexo          : " + fexo + "x" + 30 + " = " + fexo * 30 + " Tk");
                System.out.println("Price of Bizoran       : " + bizoran + "x" + 120 + " = " + bizoran * 120 + " Tk");
                System.out.println("Price of Bislol        : " + Bislol + "x" + 40 + " = " + Bislol * 40 + " Tk");
                System.out.println("Price of Pride         : " + Pride + "x" + 10 + " = " + Pride * 10 + " Tk");
                System.out.println("Price of DonA          : " + dona + "x" + 3 + " = " + dona * 3 + " Tk");
                System.out.println("Price of Emistat       : " + em + "x" + 7 + " = " + em * 7 + " Tk");
                System.out.println("Price of Belko         : " + bel + "x" + 8 + " = " + bel * 8 + " Tk");
                System.out.println("Price of Cal-20        : " + cal + "x" + 5 + " = " + cal * 5 + " Tk");
                System.out.println("Price of Antazol       : " + antazol + "x" + 250 + " = " + antazol * 250 + " Tk");
                total = ((napa * 20) + (fexo * 30) + (bizoran * 120) + (Bislol * 40) + (Pride * 10) + (dona * 3)
                                + (em * 7)
                                + (bel * 8) + (cal * 5) + (antazol * 250));
                System.out.println("");
                System.out.println("");
                System.out.println("TOtal price is : " + total + " Tk");
                System.out.print("Enter Money    : ");
                t1 = m1.nextInt();

                if (t1 < total) {
                        System.out.println("Not Enough money");
                        System.out.println("Order is Cancel");
                        System.out.println("Please Check it");
                        System.out.println("Order Again");
                } else if (t1 > total) {
                        t1 -= total;
                        System.out.println("Payemnt is ok");
                        System.out.println("Please take    : " + t1 + " Tk");
                        System.out.println("Thank You");
                } else {
                        System.out.println("Payment is ok");
                        System.out.println("Thank You");

                }

        }
}