package com.company.homework6;

public class TransportTest {
    public static void main(String[] args) {
        Plane TurkishAirLine = new Plane(" TurkishAirPlane ", 590);
        TurkishAirLine.TransportWrite();
        TurkishAirLine.PlaneForPassengers();

        Train KievOdessa = new Train(" Dragon ", 50);
        KievOdessa.TransportWrite();
        KievOdessa.TrainForUsualPeople();

        SportCar Maserati = new SportCar(" Maserati ", 250);
        Maserati.TransportWrite();
        Maserati.SportCarForCoolGuys();
    }
}
