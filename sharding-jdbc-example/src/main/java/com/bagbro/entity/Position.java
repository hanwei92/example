package com.bagbro.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 11:20
 * @Description:
 * @Version: 1.0
 */
@Data
@Entity
@Table(name = "position")
public class Position implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private String salary;

    @Column(name = "city")
    private String city;
}
