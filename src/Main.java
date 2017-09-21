import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Fahrenheit : ");
        Scanner userIn = new Scanner(System.in);
        double fahre = userIn.nextDouble();
        double celci = ((5.0/9)*(fahre-32));



        System.out.println(fahre+" grader Fahrenheit er lig : " + celci + " grader Celcius.");

    }
}
