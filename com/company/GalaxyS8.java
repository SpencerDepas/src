package com.company;

/**
 * Created by SpencerDepas on 3/3/16.
 */
public class GalaxyS8 extends Phone {


    public GalaxyS8(){
        mSDcard =  new DuelSDCard();
    }




    @Override
    public void whoIsManufacturer() {
        System.out.println("My manufacturer is Samsung");
    }
}
