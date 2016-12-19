
public class TemperatureConverter {
	public double convertFromFahrenheitToCelsius (int fahrenheit){
		double celsius =  (fahrenheit -32 ) * (double) (5.0/9.0);
		return celsius;
	}
}
