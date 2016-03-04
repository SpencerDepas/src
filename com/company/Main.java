package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        //System.out.print("ret");

        //STRATEGY PATTERN!

        Phone galaxyS8 = new GalaxyS8();
        galaxyS8.turnOn();
        galaxyS8.whoIsManufacturer();
        galaxyS8.sDCardStatus();
        System.out.println(" ");


        galaxyS8.changeSimCardType(new SingleSimCard());
        galaxyS8.sDCardStatus();
    }
}
