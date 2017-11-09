import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Fahrenheit : ");
        //Scanner der henter "userværdi"
        Scanner userIn = new Scanner(System.in);
        //giver værdien "userværdi" til fahrenheit
        double fahre = userIn.nextDouble();
        //Calc der udrenger celcius
        double celci = ((5.0/9)*(fahre-32));


        //En sout, der printer hvad der er sket...
        System.out.println(fahre+" grader Fahrenheit er lig : " + celci + " grader Celcius.");

    }
}
