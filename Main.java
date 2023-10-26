import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner askDegree = new Scanner(System.in);
        System.out.println("Enter degree in celcius: ");
        Double Celcius = askDegree.nextDouble();
        Double Fahrenheit = ((9.0/5.0)*Celcius) + 32;
        System.out.print(Celcius + "°C" + " in fahrenheit is " +Fahrenheit + "°F");


    }
}
