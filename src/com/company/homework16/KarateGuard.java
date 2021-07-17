package com.company.homework16;

public class KarateGuard extends BodyGuard {
    @Override
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " SHOOT !!! ");
    }

    public String toString() {
        return "KarateGuard";
    }

    @Override
    protected void notShoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " karate style fight");
    }
}
