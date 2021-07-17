package com.company.homework13;

public class LivingTaxes extends Taxes {

    int subsidiya;

    public LivingTaxes(int TaxK, int S, int subsidiya) {
        super(TaxK, S);
        this.subsidiya = subsidiya;
    }

    @Override
    public int taxes() {
        return (super.taxes() - ((super.taxes() * subsidiya) / 100));
    }

    public void LivingTaxes2() {
        System.out.println("Living taxes are " + taxes());

    }
}
