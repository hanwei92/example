package com.bagbro.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 20:41
 * @Description:
 * @Version: 1.0
 */
@Data
@Entity
@Table(name = "b_order")
public class BOrder implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "company_id")
    private long companyId;
    @Column(name = "position_id")
    private long positionId;
    @Column(name = "user_id")
    private long userId;
}
