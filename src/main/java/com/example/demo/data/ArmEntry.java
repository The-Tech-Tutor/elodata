package com.example.demo.data;

import lombok.Data;

import java.util.Date;

@Data
public class ArmEntry {
    private Long id;
    private String firstName;
    private String lastName;
    private String division;
    private String arm;
    private String weightClass;
    private Double elo;
    private Integer armId;
    private Integer divisionId;
    private Date dayOfMatch;
    private Long weightClassId;
}
