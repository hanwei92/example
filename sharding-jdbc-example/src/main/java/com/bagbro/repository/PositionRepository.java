package com.bagbro.repository;

import com.bagbro.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 15:09
 * @Description:
 * @Version: 1.0
 */
public interface PositionRepository extends JpaRepository<Position,Long> {
}
