package com.company.homework16;

public abstract class BodyGuard {
    void shoot(Murder murder) {
        murder.shootWithGun();
    }

    void notShoot(Murder murder) {
        murder.noGunNoShoot();
    }

    void saveClientLife(Murder murder, BodyGuard bodyGuard) {
        if (murder.hasGuns() == 1) {
            shoot(murder);
            shoot(bodyGuard);
        } else {
            notShoot(murder);
            notShoot(bodyGuard);
        }
    }

    protected abstract void shoot(BodyGuard bodyGuard);
    protected abstract void notShoot(BodyGuard bodyGuard);
}
