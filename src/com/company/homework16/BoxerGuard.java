package com.company.homework16;

public class BoxerGuard extends BodyGuard {
    @Override
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " SHOOT !!! ");
    }

    public String toString() {
        return "BoxerGuard";
    }

    @Override
    protected void notShoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " box style fight");
    }
}
