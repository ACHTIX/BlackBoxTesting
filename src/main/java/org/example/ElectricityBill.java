package org.example;

import java.util.Scanner;

public class ElectricityBill {

    private double billToPay;

    private double serviceCharge = 38.22;

    private double units;

    public ElectricityBill(double units) {
        this.units = units;
    }

    public ElectricityBill(double billToPay , double serviceCharge) {
        this.billToPay = billToPay;
        this.serviceCharge = serviceCharge;
    }

    public double getBillToPay() {
        return billToPay;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getUnits() {
        return units;
    }

    public void calculateElectricityBill(){
        if(units <= 150) {
            billToPay = (units * 3.25) + serviceCharge;
        }

        if(units > 150 && units <= 400){
            billToPay = (units * 4.22) + serviceCharge;
        }

        if(units > 400) {
            billToPay = (units * 4.42) + serviceCharge;
        }
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);
    }

    /*public static void main(String[] args) {

        double billToPay = 0;
        double serviceCharge = 38.22;

        Scanner u = new Scanner(System.in);
        System.out.print("Insert Unit : ");
        Double units = u.nextDouble();

            if(units <= 150) {
                billToPay = (units * 3.25) + serviceCharge;
            }

            if(units > 150 && units <= 400){
                billToPay = (units * 4.22) + serviceCharge;
            }

            if(units > 400) {
                billToPay = (units * 4.42) + serviceCharge;
            }
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);
    }*/
}
