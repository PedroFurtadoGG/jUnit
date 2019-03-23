package classes;
public class ConversorTemperatura {
	
	
	public static double converteCelsiusParaFarenheit(double celsius) {
		double farenheit = 1.8 * celsius + 32;
		return farenheit;
	}
	
	public static double converteFarenheitCelsius(double farenheit) {
//		double celsius = ((farenheit - 32)*5)/9;
		double celsius = (5.0/9.0) * (farenheit - 32.0);
		return celsius;
	}
	
}