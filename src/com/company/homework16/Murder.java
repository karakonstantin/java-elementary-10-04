package com.company.homework16;

public class Murder {
    int guns;

    public Murder(int guns) {
        this.guns = guns;
    }

    public int hasGuns() {
        return this.guns;
    }

    public void shootWithGun() {
        System.out.println("Murder shoots a person");
    }
    public void noGunNoShoot(){
        System.out.println("Murder does not shoot a person");
    }


}
