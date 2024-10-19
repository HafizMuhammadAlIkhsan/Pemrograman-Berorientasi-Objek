package com;

public class Comission extends Hourly {
    private double total_sales;
    private double comission_rate;

    public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comission_rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comission_rate = comission_rate;
    }
    
    public void addSales(double total_sales) {
        this.total_sales = total_sales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + total_sales * comission_rate;
        total_sales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + pay();
        return result;
    }
}