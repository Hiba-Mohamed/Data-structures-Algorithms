import java.util.Scanner;

public class TempAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        System.out.print("Please enter how many temperature values you would like to calculate the average of: ");
        int lengthOfArray = scanner.nextInt();

        double[] temperatures = new double[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.print("Enter temperature value #" + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        double sumOfAllValues = 0;
        for (int i = 0; i < lengthOfArray; i++) {
            sumOfAllValues += temperatures[i];
        }
        double averageTemp = sumOfAllValues / lengthOfArray;
        System.out.println("");

        System.out.println("Average Temperature: " + averageTemp);
                System.out.println("");

        System.out.println("Temperatures above average:");

        for (int i = 0; i < lengthOfArray; i++) {
            if (temperatures[i] > averageTemp) {
                System.out.println("Temperature value #" + (i + 1) + ": " + temperatures[i]);
            }
        }

        System.out.println("");

        scanner.close();
    }
}
