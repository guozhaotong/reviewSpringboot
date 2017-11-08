package com.example.demo.repository;

import com.example.demo.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 郭朝彤
 * @date 2017/11/8.
 */
public interface CareRepository extends JpaRepository<Card, Long> {
    Card findByCardNumber(String name);
}
