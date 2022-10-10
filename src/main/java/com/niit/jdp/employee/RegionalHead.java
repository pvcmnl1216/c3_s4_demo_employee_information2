/*
 * Author Name: Philip Meshach
 * Date: 10-10-2022
 * Praise The Lord
 */
package com.niit.jdp.employee;

import java.time.LocalDate;

public class RegionalHead extends Manager {
    private int regionPerformance;
    private int rating;

    public RegionalHead(String name, int age, LocalDate dateOfBirth, String address, double salary, int teamSize, int rating, int regionPerformance, int rating1) {
        super(name, age, dateOfBirth, address, salary, teamSize, rating);
        this.regionPerformance = regionPerformance;
        this.rating = rating1;
    }
}
