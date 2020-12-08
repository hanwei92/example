package com.bagbro.repository;

import com.bagbro.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: Bag Bro
 * @Date: 2020/12/8 21:58
 * @Description:
 * @Version: 1.0
 */
public interface StudentRepository extends JpaRepository<Student,Long> {
}
