package com.speednetworking;

/**
 * Created by aacuna on 2/4/17.
 */
public class Person {

//    declare instance variables
    private String first;
    private String last;
    private String jobtitle;
    private String company;
    private String email;
    private String linkedin;

//    To Do: Add data sanitization options for user input

//    To Do: fill out the rest of the characteristics and add to person method

//    Define constructor - sets the instance variables
    public Person(String first, String last, String jobtitle, String company, String email, String linkedin) {
        this.setFirst(first);
        this.setLast(last);
        this.setJobtitle(jobtitle);
        this.setCompany(company);
        this.setEmail(email);
        this.setLinkedin(linkedin);
    }

//    Method prints name
    public void printPersonName() {
        System.out.print(getFirst() +' '+ getLast());
    }

//    Method prints all instance variables
    public String toString(){
        String result = first + " " + last + " " + jobtitle + " " + company + " " + email + " " + linkedin;
        return result;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
}
