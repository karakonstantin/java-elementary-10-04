package com.company.homework16;

public class JiuJitsuGuard extends BodyGuard {
    protected void shoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " SHOOT !!! ");
    }

    public String toString() {
        return "JiuJitsuGuard";
    }

    @Override
    protected void notShoot(BodyGuard bodyGuard) {
        System.out.println(bodyGuard.toString() + " jiu jitsu style fight");
    }
}
