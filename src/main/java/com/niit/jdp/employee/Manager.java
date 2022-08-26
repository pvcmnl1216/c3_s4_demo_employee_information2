/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.employee;

import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;
    private int rating;

    public Manager(String name, int age, LocalDate dateOfBirth, String address, double salary, int teamSize, int rating) {
        super(name, age, dateOfBirth, address, salary);
        this.teamSize = teamSize;
        this.rating = rating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
