package com.company;

/**
 * Created by SpencerDepas on 3/3/16.
 */
public abstract class Phone  {

    SDCardBehavior mSDcard;


    Phone(){


    }

    public void changeSimCardType(SDCardBehavior mSDcard){
        this.mSDcard = mSDcard;
    }

    public void sDCardStatus(){
        mSDcard.sDCardStatus();
    }


    public void turnOn(){
        System.out.print("Phone is now on. BEEb Boop");

    }

    public void turnOff(){
        System.out.print("Phone is now off.");
    }

    public abstract void whoIsManufacturer();

}
