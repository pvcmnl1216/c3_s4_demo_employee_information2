/*
 * Author Name: Divyansh Bhardwaj
 * Date: 26-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.employee;

import java.time.LocalDate;

public class ManagerImpl {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Divyansh Bhardwaj",
                26,
                LocalDate.of(2022, 8, 26),
                "Pune",
                100000,
                5,
                5
        );
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Date of Birth: " + manager.getDateOfBirth());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Team Size: " + manager.getTeamSize());
        System.out.println("Rating: " + manager.getRating());
    }
}
