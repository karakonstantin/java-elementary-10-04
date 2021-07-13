package com.company.homework15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A CELSIUSNUMBER :  ");
        String str1 = bufferedReader1.readLine();
        int temperature = Integer.parseInt(str1);

        CelsiusTemperature celsiusTemperature = new CelsiusTemperature(temperature);
        KelvinTemperature kelvinTemperature = new KelvinTemperature(temperature);
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(temperature);

        while (true) {
            System.out.println("celsiusTemperature is " + celsiusTemperature.getNumberCelsius());


            while (true) {
                System.out.println("Its high time converter worked. Enter \"fahrenheitTemperature\" or \"kelvinTemperature\"");
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
                String str2 = bufferedReader2.readLine().toLowerCase().trim();
                switch (str2) {
                    case "fahrenheitTemperature":
                        fahrenheitTemperature.TemperatureConvert();
                        break;
                    case "kelvinTemperature":
                        kelvinTemperature.TemperatureConvert();
                        break;
                    default:
                        System.out.println("enter any of them : ");

                }

            }

        }
    }
}
