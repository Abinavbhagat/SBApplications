package com.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Employee {

    private int id;
    private String name;
    private int dob;
    private double salary;
    private String city;
    private String desig;
}
