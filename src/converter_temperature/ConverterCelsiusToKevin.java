package converter_temperature;

public class ConverterCelsiusToKevin extends ConverterTemperature{
    @Override
public double convert(double celsius) {
        return celsius - 273.15;
    }
}
