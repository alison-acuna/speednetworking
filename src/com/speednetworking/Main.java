package com.speednetworking;

// Main class where all programs start

public class Main {

    public static void main(String[] args) {
	// Test Person Class
        Person person1 = new Person("Cat","Acuna", "BSE", "New Relic", "aacuna@newrelic.com", "https://www.linkedin.com/in/alisonacuna");
        Person person2 = new Person("Alison","Acuna", "BSE", "New Relic", "aacuna@newrelic.com", "https://www.linkedin.com/in/alisonacuna");
        Person person3 = new Person("Loren","Acuna", "BSE", "New Relic", "aacuna@newrelic.com", "https://www.linkedin.com/in/alisonacuna");
        Person person4 = new Person("Frank","Acuna", "BSE", "New Relic", "aacuna@newrelic.com", "https://www.linkedin.com/in/alisonacuna");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        person1.setFirst("Christi");
        System.out.println(person1.toString());
//        Test Event Class
        Event event1 = new Event(1, "October 2nd 1986");
        System.out.println(event1.eventToString());
//        Test RSVP method

    }
}
