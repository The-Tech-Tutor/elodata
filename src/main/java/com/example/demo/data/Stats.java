package com.example.demo.data;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@IdClass(StatsPk.class)
@Table(name = "stats")
public class Stats {

    @Id
    private Long id;

    @Id
    private Long weightClassId;

    @Id
    private String division;

    @Id
    private String arm;

    private String firstName;

    private String lastName;

    private Double elo;

    @CreationTimestamp
    private Date created;
}
