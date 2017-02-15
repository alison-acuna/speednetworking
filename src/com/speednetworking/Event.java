package com.speednetworking;

/**
 * Created by aacuna on 2/6/17.
 */
public class Event {
    private int instance;
    private String date;

    public Event (int instance, String date){
        this.setInstance(instance);
        this.setDate(date);
    }

    //    Method prints all instance variables
    public String eventToString(){
        String result = instance + " " + date;
        return result;
    }

    public int getInstance() {
        return instance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setInstance(int instance) {
        this.instance = instance;
    }

    //  Add display rsvp list method
    // Create a set
    Set set = new HashSet();

    Collection<Type> noDups = new HashSet<Type>(c);


}
