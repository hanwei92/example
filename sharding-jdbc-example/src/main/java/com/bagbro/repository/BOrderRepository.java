package com.bagbro.repository;

import com.bagbro.entity.BOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 20:47
 * @Description:
 * @Version: 1.0
 */
public interface BOrderRepository extends JpaRepository<BOrder,Long> {
}
