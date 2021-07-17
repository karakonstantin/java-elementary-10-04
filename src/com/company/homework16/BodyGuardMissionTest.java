package com.company.homework16;

public class BodyGuardMissionTest {
    private final boolean HAS_GUN = true;
    private static Murder murderGun = new Murder(100);
    private static Murder murderNotGun = new Murder(0);

    public static void main(String[] args) {
        BodyGuardMissionTest bodyGuardMissionTest = new BodyGuardMissionTest();

        BodyGuard boxerGuard = new BoxerGuard();
        bodyGuardMissionTest.setBodyGuard(boxerGuard);

        BodyGuard karateGuard = new KarateGuard();
        bodyGuardMissionTest.setBodyGuard(karateGuard);

        BodyGuard jiuJitsuGuard = new JiuJitsuGuard();
        bodyGuardMissionTest.setBodyGuard(jiuJitsuGuard);

    }

    private void setBodyGuard(BodyGuard bodyGuard) {
        if (HAS_GUN == true) {
            bodyGuard.saveClientLife(murderGun, bodyGuard);
        } else {
            bodyGuard.saveClientLife(murderNotGun, bodyGuard);
        }
    }
}
