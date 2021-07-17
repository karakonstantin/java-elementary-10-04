package com.company.homework13;

// #5
public class TaxesTest {
    public static void main(String[] args) {
        ProductionTaxes productionTaxes = new ProductionTaxes(10, 4);
        productionTaxes.productionTaxes();

        LivingTaxes livingTaxes = new LivingTaxes(5, 2, 10);
        livingTaxes.LivingTaxes2();

        TradingTaxes tradingTaxes = new TradingTaxes(15, 6, 900);
        tradingTaxes.TradingTaxes();
    }
}
