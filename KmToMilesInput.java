import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();
        double kmPerMile = 1.6;
        double miles = km / kmPerMile;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}