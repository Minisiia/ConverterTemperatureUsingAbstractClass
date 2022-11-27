package converter_temperature;

public class ConverterCelsiusToFahrenheit extends ConverterTemperature{
    @Override
public double convert(double celsius) {
        return (9 * celsius / 5) + 32;
    }
}
