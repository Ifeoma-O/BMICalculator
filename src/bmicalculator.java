import java.util.Scanner;

public class bmicalculator {
        public static void main(String[] args) {
            bmiCalculator();
        }
        public static void bmiCalculator() {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter weight in pounds: ");
            double weight = input.nextDouble();
            System.out.print("Enter feet: ");
            double feet = input.nextDouble();
            System.out.print("Enter inches: ");
            double inches = input.nextDouble();

            double inchesSquared = Math.pow((12 * feet) + inches, 2);
            double weightDivide = weight / inchesSquared;
            double bmiResult = weightDivide * 703;

            System.out.println("The BMI is " + bmiResult);


        }
}
