package com.company.homework15;

class KelvinTemperature extends CelsiusTemperature implements TemperatureConverter {
    public KelvinTemperature(int NumberCelsius) {
        super(NumberCelsius);
    }

    @Override
    public void TemperatureConvert() {
        System.out.println(273 + super.NumberCelsius);
    }
}
