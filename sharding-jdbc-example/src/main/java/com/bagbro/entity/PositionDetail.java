package com.bagbro.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 15:02
 * @Description:
 * @Version: 1.0
 */
@Data
@Entity
@Table(name = "position_detail")
public class PositionDetail implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pid")
    private long pid;

    @Column(name = "description")
    private String description;
}
