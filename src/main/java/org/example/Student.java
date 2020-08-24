package org.example;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private char sex;
    private double averageYearGrade;


    //Constructors
    public Student(){

    }

    public Student(String firstName, String lastName, char sex, double averageYearGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.averageYearGrade = averageYearGrade;
    }

    public Student(int id, String firstName, String lastName, char sex, double averageYearGrade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.averageYearGrade = averageYearGrade;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getAverageYearGrade() {
        return averageYearGrade;
    }

    public void setAverageYearGrade(double averageYearGrade) {
        this.averageYearGrade = averageYearGrade;
    }

    //toString()
    @Override
    public String toString() {
        return getClass().getSimpleName() + "First Name: " + firstName
                + ", Last Name: " + lastName;
    }
}
