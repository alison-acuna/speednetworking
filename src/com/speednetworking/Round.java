package com.speednetworking;

/**
 * Created by aacuna on 2/6/17.
 */


public class Round extends Event {
    private int roundnumber;

    public Round(int instance, String date, int roundnumber){
        super(instance, date);
        this.setRoundnumber(roundnumber);
    }
    public void setRoundnumber(int roundnumber) {
        this.roundnumber = roundnumber;
    }
    public int getRoundnumber() {
        return roundnumber;
    }

//    ToDo: pull list of RSVPs + method to pair them
}
