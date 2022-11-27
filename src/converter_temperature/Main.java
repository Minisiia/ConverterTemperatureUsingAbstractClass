package converter_temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть температуру у градусах Цельсія:");
        double myCelsius = scanner.nextDouble();
        ConverterCelsiusToKevin t1 = new ConverterCelsiusToKevin();
        System.out.println("Температура у градусах Кельвіна: " + t1.convert(myCelsius));
        ConverterCelsiusToFahrenheit t2 = new ConverterCelsiusToFahrenheit();
        System.out.println("Температура у градусах Фаренгейта: " + t2.convert(myCelsius));
    }
}
