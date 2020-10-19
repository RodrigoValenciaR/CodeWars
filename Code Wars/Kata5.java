package codeWars1;

public class Kata5 {
    public static String weatherInfo(int temp) {
  
        double c = (double)convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (double)((temperature - 32) * 5)/9;
        return celsius;
    }
}
