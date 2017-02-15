package com.speednetworking;
import java.util.Scanner;

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

//    Create list of people in system so can drill downt to RSVP
//    array of reference variables not objects

//    public static void main(string[] args) {
//        Scanner input = new Scanner(System.in);
//        Person.[] rsvp = new Person[10];
//        for (int i = 0; i < rsvp.length; i++){
//            System.out.println("");
//            temp = inpout.next();
//            cars[i] = new Car ();
//            cars[i].setModel(temp);
//        }
//        for (in i = 0; i < carslenght; i++){
//            System.out.println("Model: " + cars[i].getMondel())
//        }
//    }

    public void setInstance(int instance) {
        this.instance = instance;
    }

    //  Add display rsvp list method
    // Create a set
    Set set = new HashSet();

    Collection<Type> noDups = new HashSet<Type>(c);


}
