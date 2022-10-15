package com.example.demo.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class StatsPk implements Serializable {
    protected Long id;

    protected Long weightClassId;

    protected String division;

    protected String arm;
}
