import java.util.Scanner;

public class LongitudArea {

public static void main (String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Por favor ingresa el radio de la circunferencia: ");

double radio = scanner.nextDouble();

//La formula para encontrar la longitud es 2π * r
double longitud = 2 * 3.14159 * radio;

    double area = 3.14159 * radio * radio;

    System.out.println("La longitud de la circunferencia es: " + longitud);
    System.out.println("El area de la circunferencia es: " + area);

    scanner.close();

}

}

