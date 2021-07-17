package com.company.homework13;

// #1
public class Taxes {
    int TaxK;
    int S;

    public Taxes(int TaxK, int S) {
        this.TaxK = TaxK;
        this.S = S;
    }

    public int taxes() {
        int taxes = (TaxK * S);
        return taxes;
    }

}
