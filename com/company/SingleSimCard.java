package com.company;

/**
 * Created by SpencerDepas on 3/3/16.
 */
public class SingleSimCard implements SDCardBehavior{

    @Override
    public void sDCardStatus() {
        System.out.println("I have a single sim card");
    }
}