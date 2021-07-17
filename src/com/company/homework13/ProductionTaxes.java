package com.company.homework13;

public class ProductionTaxes extends Taxes {

    public ProductionTaxes(int TaxK, int S) {
        super(TaxK, S);
    }

    public void productionTaxes() {
        System.out.println("Production taxes are " + taxes());
    }
}
