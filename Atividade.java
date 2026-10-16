import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("temperatura em celsius" + celsius + "C");
        System.out.println("temperatura em fahrenheit:" + fahrenheit + "F");
        System.out.println("graus kelvin:" + kelvin + "K");

        scanner.close();
    }
}