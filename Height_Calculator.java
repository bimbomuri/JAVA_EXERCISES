
/* Write a program with which you can convert a human height given in feet and inches to
centimeters. The program should ask the user to type in his or her height in two parts: first the
height in feet and then the inches part for the height. (A person can say that his or her height
is, for example, 5 feet and 9 inches. That would be 30.48 * 5 + 2.54 * 9 centimeters. */
import java.util.*;

class Calculate_height {
    int feet;
    int inches;
    float height;

    void height_calc_incm(int feet, int inches) {
        double calculation = (30.48 * feet) + (2.54 * inches);
        System.out.printf("Your height in cm is : %fcm", calculation);
        // System.out.println(calculation);
    }

    void height_calc_inm(float height) {
        double calc1 = (height / 30.48);
        System.out.printf("Your height in feet and inches : %f foot", calc1);
    }

}

public class Height_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("This program makes calculations related to your height."
                + "\n Type 1 to give your height in feet and inches or "
                + "\n Type 2 to give your height in centimeters. ");
        int unit_selection = sc.nextInt();
        if (unit_selection == 1) {
            System.out.println(" ");
            System.out.println("Enter your Height in feet: ");
            int feet = sc.nextInt();
            System.out.println("Enter your Height in inches: ");
            int inches = sc.nextInt();
            Calculate_height ch = new Calculate_height();
            ch.feet = feet;
            ch.inches = inches;
            ch.height_calc_incm(feet, inches);
        } else if (unit_selection == 2) {
            System.out.println("Enter your height in centimeters: ");
            float height = sc.nextInt();
            Calculate_height ch = new Calculate_height();
            ch.height = height;
            ch.height_calc_inm(height);
        } else {
            System.out.println("Wrong Unit Selection!");
        }

    }
}
