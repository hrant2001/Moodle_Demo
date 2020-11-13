package org.example;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private double averageYearGrade;
    private String sex;

    //Constructors
    public Student(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.sex = "Male";
        this.averageYearGrade = 10;
    }

    public Student(int id, String firstName, String lastName, double averageYearGrade, String sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageYearGrade = averageYearGrade;
        this.sex = sex;
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

    public double getAverageYearGrade() {
        return averageYearGrade;
    }

    public void setAverageYearGrade(double averageYearGrade) {
        this.averageYearGrade = averageYearGrade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //toString()
    @Override
    public String toString() {
        return getClass().getSimpleName() + "First Name: " + firstName
                + ", Last Name: " + lastName + ", Average: " + averageYearGrade + ", Sex: " + sex;
    }
}
