package com.company.homework13;

public class TradingTaxes extends Taxes {
    int income;

    public TradingTaxes( int TaxK, int S, int income) {
        super(TaxK, S);
        this.income = income;
    }

    public void TradingTaxes() {
        if (income < 100 ) {
            System.out.println("No trading taxes");
        } else {
            System.out.println("Trading taxes are " + taxes());
        }
    }

}
