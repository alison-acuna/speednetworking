package com.speednetworking;

// Main class where all programs start

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person("Cat","Acuna", "BSE", "New Relic", "aacuna@newrelic.com", "https://www.linkedin.com/in/alisonacuna");
        System.out.println(person1.toString());
        person1.setFirst("Christi");
        System.out.println(person1.toString());
    }
}
