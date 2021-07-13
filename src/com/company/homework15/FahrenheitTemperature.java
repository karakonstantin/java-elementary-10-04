package com.company.homework15;

class FahrenheitTemperature extends CelsiusTemperature implements TemperatureConverter {
    public FahrenheitTemperature(int NumberCelsius) {
        super(NumberCelsius);

    }

    @Override
    public void TemperatureConvert() {
        int celsius = super.NumberCelsius;
        int SetFahrenheitTemperature = (int) ((celsius * 1.8) + 32);
        System.out.println(SetFahrenheitTemperature);
    }
}
